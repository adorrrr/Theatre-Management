package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;





public class LoginSceneController implements Initializable {

    @FXML private Label warningTextField;
    @FXML private ComboBox<String> userTypeComboBox;
    @FXML private PasswordField passwordTextField;
    @FXML private TextField idTextField;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userTypeComboBox.getItems().addAll(
                "General Manager",
                "Producer",
                "Dirctor",
                "Production Manager",
                "Artist",
                "Marketing Manager",
                "Venu Manager",
                "Audience");
    }    

    @FXML
    private void loginOnMouseClick(ActionEvent event) throws IOException {
        boolean matched = false;
        String IdNo = idTextField.getText();
        String password = passwordTextField.getText();
        String userType = userTypeComboBox.getValue();
        String filename = "";
        
        // Determine the appropriate filename based on the selected userType
        if (userType.equals("General Manager")) 
        {
            filename = "General Manager.txt";
        } 
        else if (userType.equals("Producer")) 
        {
            filename = "Producer.txt";
        } 
        else if (userType.equals("Dirctor"))
        {
            filename = "Dirctor.txt";
        }
        else if (userType.equals("Production Manager"))
        {
            filename = "Production Manager.txt";
        }
        else if (userType.equals("Artist"))
        {
            filename = "Artist.txt";
        }
        else if (userType.equals("Marketing Manager"))
        {
            filename = "Marketing Manager.txt";
        }
        else if (userType.equals("Venu Manager"))
        {
            filename = "Venu Manager.txt";   
        }
        else if (userType.equals("Audience"))
        {
            filename = "Audience.txt";       // input txt
        }
      
        
        
    }
    

    @FXML
    private void createNewAccountOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("CreateAccountScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}