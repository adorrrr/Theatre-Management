
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class DirectorScriptSelectSceneController implements Initializable {

    @FXML
    private TextArea writingScriptTextField;
    @FXML
    private TextField writerNameTextField;
    @FXML
    private TextField showsNameTextField;


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    
    

    @FXML
    private void returnHomeButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void sendScriptOnClick(ActionEvent event) {
        
        Script i = new Script(writerNameTextField.getText(),showsNameTextField.getText(),writingScriptTextField.getText());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Script.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(i);
            
        } catch (IOException ex) {
            Logger.getLogger(DirectorScriptSelectSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(DirectorScriptSelectSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
