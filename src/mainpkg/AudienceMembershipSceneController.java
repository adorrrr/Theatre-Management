/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        }else {
            // saving data for login        
            File dir = new File("Membership Info");
            if(!dir.exists()) 
            {
                dir.mkdir();
            }               
            FileWriter fw = new FileWriter(new File(dir, "MembershipData.txt"), true);
            fw.write(enterUserName.getText() + "\t" +enterUserID.getText()  + "\t" + numberlast4digits.getText() 
            + "\t" +enterUserNumber.getText()+ "\n");
            fw.close();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("Membership Status");
            a1.setContentText("Membership code : 555222888");
            a1.setHeaderText("Apply for membership has been created successfully");
            a1.showAndWait();
                                         
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
