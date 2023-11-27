/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class DirectorScheduleSceneController implements Initializable {

    @FXML
    private TableView<SchedulePick> tableView;
    @FXML
    private TableColumn<SchedulePick, String> departmentCol;
    @FXML
    private TableColumn<SchedulePick, Integer> timeCol;
    @FXML
    private TableColumn<SchedulePick, LocalDate> dateCol;
    @FXML
    private TableColumn<SchedulePick, String> scheduleCol;
    @FXML
    private DatePicker dob;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField departmentNameTextFeield;
    @FXML
    private ComboBox<String> scheduleType;

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scheduleType.getItems().addAll("Main Shooting", "Practice");
    }    

    @FXML
    private void submitOnClick(ActionEvent event) {
        SchedulePick i = new SchedulePick(departmentNameTextFeield.getText(), 
                Integer.parseInt(timeTextField.getText()),
                dob.getValue(), 
                scheduleType.getValue());
        
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("SchedulePick.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);
            

        } catch (IOException ex) {
            Logger.getLogger(DirectorScheduleSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(DirectorScheduleSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        ObservableList<SchedulePick> ScheduleList = FXCollections.observableArrayList();
        //    formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<SchedulePick, String>("department"));
        timeCol.setCellValueFactory(new PropertyValueFactory<SchedulePick, Integer>("time"));
        dateCol.setCellValueFactory(new PropertyValueFactory<SchedulePick, LocalDate>("Date"));
        scheduleCol.setCellValueFactory(new PropertyValueFactory<SchedulePick, String>("schedule"));

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("SchedulePick.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            SchedulePick p;
            try {
                while (true) {
                    p = (SchedulePick) ois.readObject();
                    ScheduleList.add(p);
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
        tableView.setItems(ScheduleList);
    }

    @FXML
    private void returnHomePage(ActionEvent event) {
        
    }
    
}
