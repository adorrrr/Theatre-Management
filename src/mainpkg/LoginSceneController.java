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
        if(userTypeComboBox.getValue() == null) {
            Alert();
        }
        else if(idTextField.getText().isEmpty()) {
            Alert();
        }
        else if(passwordTextField.getText().isEmpty()) {
            Alert();
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
    private void Alert(){
    Alert a1 = new Alert(Alert.AlertType.INFORMATION);
    a1.setTitle("LogIn Status");
    a1.setContentText("Click Ok to Continue");
    a1.setHeaderText("Welcome ");
    a1.showAndWait();
    }
    
}
