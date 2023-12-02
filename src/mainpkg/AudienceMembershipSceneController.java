/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudienceMembershipSceneController implements Initializable {

    @FXML
    private TextField enterUserName;
    @FXML
    private TextField enterUserID;
    @FXML
    private TextField enterUserNumber;
    @FXML
    private TextField numberlast4digits;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void applyForMembership(ActionEvent event) throws IOException {
        if (enterUserName.getText().isEmpty() 
                || enterUserID.getText().isEmpty() 
                || numberlast4digits.getText().isEmpty() 
                || enterUserNumber.getText().isEmpty()){

            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
            
            
        }else {
            Membership i = new Membership(enterUserName.getText(),
                    Integer.parseInt(enterUserID.getText()),
                    Integer.parseInt(numberlast4digits.getText()),
                    Integer.parseInt(enterUserNumber.getText()));
            
            
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Membership.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("Membership Status");
            a1.setContentText("Membership code : 555222888");
            a1.setHeaderText("Apply for membership has been created successfully");
            a1.showAndWait();

        } catch (IOException ex) {
            Logger.getLogger(AudienceMembershipSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(AudienceMembershipSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }
    }
    @FXML
    private void returnHomePage(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();   
        
    }
    
}
