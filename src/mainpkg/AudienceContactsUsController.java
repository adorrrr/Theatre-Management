/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;






public class AudienceContactsUsController implements Initializable {

    @FXML
    private ComboBox<String> selectVenueCombocox;
    @FXML
    private TableView<VanueContacts> tableView;
    @FXML
    private TableColumn<VanueContacts, String> addressCol;
    @FXML
    private TableColumn<VanueContacts, Integer> numberCol;
    @FXML
    private TableColumn<VanueContacts, String> mailCol;


    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectVenueCombocox.getItems().addAll("Chittagong",
                "Dhaka","Khulna","Sylhet"
                );
    }    


    @FXML
    private void selectVenueComboBoxOnItemSelected(ActionEvent event) {
        if(selectVenueCombocox.getValue().equals("Dhaka")) {
        ObservableList<VanueContacts> ContactsList = FXCollections.observableArrayList();
        //    formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Address"));
        numberCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, Integer>("Number"));
        mailCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Mail"));


        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File(".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VanueContacts p;
            try {
                while (true) {
                    p = (VanueContacts) ois.readObject();
                    ContactsList.add(p);
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
        tableView.setItems(ContactsList);  
        }
        
        
        else if(selectVenueCombocox.getValue().equals("Chittagong")) {
        ObservableList<VanueContacts> ContactsList = FXCollections.observableArrayList();
        //    formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Address"));
        numberCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, Integer>("Number"));
        mailCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Mail"));


        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File(".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VanueContacts p;
            try {
                while (true) {
                    p = (VanueContacts) ois.readObject();
                    ContactsList.add(p);
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
        tableView.setItems(ContactsList);  
        }
        else if(selectVenueCombocox.getValue().equals("Khulna")) {
        ObservableList<VanueContacts> ContactsList = FXCollections.observableArrayList();
        //    formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Address"));
        numberCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, Integer>("Number"));
        mailCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Mail"));


        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File(".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VanueContacts p;
            try {
                while (true) {
                    p = (VanueContacts) ois.readObject();
                    ContactsList.add(p);
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
        tableView.setItems(ContactsList);  
        }
        else if(selectVenueCombocox.getValue().equals("Sylhet")) {
        ObservableList<VanueContacts> ContactsList = FXCollections.observableArrayList();
        //    formate:  columnFxid.setCellValueFactory(new PropertyValueFactory<ModelClass, Type>("ModelcCassFieldName"));
        addressCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Address"));
        numberCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, Integer>("Number"));
        mailCol.setCellValueFactory(new PropertyValueFactory<VanueContacts, String>("Mail"));


        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File(".bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VanueContacts p;
            try {
                while (true) {
                    p = (VanueContacts) ois.readObject();
                    ContactsList.add(p);
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
        tableView.setItems(ContactsList);  
        }
        
}

    @FXML
    private void rerturnHomePage(ActionEvent event) throws IOException {
        Parent mainLCManagementLogInFormParent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));        
        Scene mainLCManagementLogInFormScene = new Scene(mainLCManagementLogInFormParent);        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        stage.setScene(mainLCManagementLogInFormScene);
        stage.show();
    }
    
}
