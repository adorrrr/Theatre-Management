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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class DirectorFeedbackSceneController implements Initializable {

    @FXML
    private TextArea directorGiveFeedbackTextArea;
    @FXML
    private TextField artistNameTextField;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitFeedbackButtonOnClick(ActionEvent event) throws IOException {
        File dic = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            dic = new File("Diector Feedback.bin");
            if(dic.exists()) fos = new FileOutputStream(dic,true);
            else fos = new FileOutputStream(dic);           

            dos = new DataOutputStream(fos);
            
            dos.writeUTF(artistNameTextField.getText());
            dos.writeUTF(directorGiveFeedbackTextArea.getText());
            
            String formattedDate = LocalDate.now().toString(); 
            dos.writeUTF(formattedDate);
            
            artistNameTextField.clear();
            directorGiveFeedbackTextArea.clear();
        } 
        
        catch (IOException ex) {
            Logger.getLogger(DirectorFeedbackSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        finally {
            try {
                if(dos != null) dos.close();
            } 
            
            catch (IOException ex) {
                Logger.getLogger(DirectorFeedbackSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }
    
}
