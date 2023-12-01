/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class DirectorShiftCheckSceneController implements Initializable {

    @FXML
    private TableView<EmployeeShift> tableView;
    @FXML
    private TableColumn<EmployeeShift, String> nameCol;
    @FXML
    private TableColumn<EmployeeShift, String> departmentCol;
    @FXML
    private TableColumn<EmployeeShift, LocalDate> dateCol;
    @FXML
    private TableColumn<EmployeeShift, String> stratCol;
    @FXML
    private TableColumn<EmployeeShift, String> endCol;
    @FXML
    private TableColumn<EmployeeShift, String> presenceCol;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void retuenHomePage(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void loadOnClick(ActionEvent event) {
        ObservableList<EmployeeShift> EmployeList = FXCollections.observableArrayList();
        nameCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, String>("name"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, String>("department"));
        dateCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, LocalDate>("date"));
        stratCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, String>("shiftStart"));
        endCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, String>("shiftEnd"));
        presenceCol.setCellValueFactory(new PropertyValueFactory<EmployeeShift, String>("presence"));
        

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File(".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EmployeeShift p;
            try {
                while (true) {
                    p = (EmployeeShift) ois.readObject();
                    EmployeList.add(p);
                    System.out.println(p.toString());
                }
            } catch (Exception e) {
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }

        }
        tableView.setItems(EmployeList);

    }
    
}
