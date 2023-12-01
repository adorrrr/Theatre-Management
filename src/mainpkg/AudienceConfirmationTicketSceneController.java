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
public class AudienceConfirmationTicketSceneController implements Initializable {

    @FXML
    private TableView<Ticket> tableView;
    @FXML
    private TableColumn<Ticket, String> showsNameCol;
    @FXML
    private TableColumn<Ticket, LocalDate> dodCol;
    
    @FXML
    private TableColumn<Ticket, Integer> noOfTicketCol;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Ticket> TicketList = FXCollections.observableArrayList();
        // formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        showsNameCol.setCellValueFactory(new PropertyValueFactory<Ticket, String>("showsNameComboBox"));
        noOfTicketCol.setCellValueFactory(new PropertyValueFactory<Ticket, Integer>("noOfTicket"));
        dodCol.setCellValueFactory(new PropertyValueFactory<Ticket, LocalDate>("dob"));
        

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Purchase Ticket.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Ticket p;
            try {
                while (true) {
                    p = (Ticket) ois.readObject();
                    TicketList.add(p);
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
        tableView.setItems(TicketList);

    
    }    

    @FXML
    private void returnHomePage(ActionEvent event) throws IOException {
        Parent mainLCManagementLogInFormParent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));        
        Scene mainLCManagementLogInFormScene = new Scene(mainLCManagementLogInFormParent);        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        stage.setScene(mainLCManagementLogInFormScene);
        stage.show();
    }
    
}
