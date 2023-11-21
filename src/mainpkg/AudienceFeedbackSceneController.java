/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudienceFeedbackSceneController implements Initializable {

    @FXML
    private TextArea feedbackTextArea;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField usernameTextField1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void submitFeedbackButtonOnClick(ActionEvent event) {
        File file = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            file = new File("Feedback.bin");
            if(file.exists()) fos = new FileOutputStream(file,true);
            else fos = new FileOutputStream(file);           

            dos = new DataOutputStream(fos);
            
            dos.writeUTF(userIDTextField.getText());
            dos.writeUTF(usernameTextField1.getText());
            dos.writeUTF(feedbackTextArea.getText());
            // Convert LocalDate to String
            String formattedDate = LocalDate.now().toString(); 
            dos.writeUTF(formattedDate);
            
            userIDTextField.clear();
            usernameTextField1.clear();
            feedbackTextArea.clear();
        } 
        
        catch (IOException ex) {
            Logger.getLogger(AudienceFeedbackSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        finally {
            try {
                if(dos != null) dos.close();
            } 
            
            catch (IOException ex) {
                Logger.getLogger(AudienceFeedbackSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
        //change
    }
    
}
