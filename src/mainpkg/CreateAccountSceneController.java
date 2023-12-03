package mainpkg;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class CreateAccountSceneController implements Initializable {   
    @FXML private ComboBox<String> userTypeComboBox;
    @FXML private TextField nameTextField;
    @FXML private TextField IDTextField;
    @FXML private TextField passwordTextField;
    @FXML private DatePicker dobDatePicker;

    
    boolean addUserStatus;
    
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
    private void signUpOnMouseClick(ActionEvent event) throws FileNotFoundException, IOException {
        if(userTypeComboBox.getValue().equals("Audience")){
            audienceAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();                                         
        }   
        else if(userTypeComboBox.getValue().equals("Dirctor")){
            dirctorAndShow(); 
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("General Manager")){
            generalManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Producer")){
            producerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Production Manager")){
            productionManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Artist")){
            artistAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Marketing Manager")){
            marketingManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else if(userTypeComboBox.getValue().equals("Venu Manager")){
            venuManagerAndShow();
            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("LogIn Status");
            a1.setContentText("Click Ok to Continue");
            a1.setHeaderText("Your account has been created successfully");
            a1.showAndWait();
            Parent tableViewParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }
        else {
            Alert a2 = new Alert(Alert.AlertType.WARNING);
            a2.setTitle("Warning ");
            a2.setHeaderText("LogIn Failed");
//            a2.setContentText("Wrong ID/Password");
            a2.setContentText("Wrong ID/Password. Please Try Again");
            a2.showAndWait();
        }
 }     
       
    

    
    
    
    @FXML
    private void backLoginSceneOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    
    
    
    
    
    
    
    private void audienceAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Audience.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void dirctorAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Dirctor.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void generalManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("General Manager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void producerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Producer.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    private void productionManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Production Manager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void artistAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Artist.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void marketingManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Marketing Manager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
    private void venuManagerAndShow() throws IOException {
         if (nameTextField.getText().isEmpty() 
                || IDTextField.getText().isEmpty() 
                || passwordTextField.getText().isEmpty() 
                || dobDatePicker.getValue() == null ){
            // Show notification to user
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the information");
            alert.showAndWait();
        } else {          
       User i = new User(nameTextField.getText(),
                    Integer.parseInt(IDTextField.getText()),
                    passwordTextField.getText(),
                    dobDatePicker.getValue(),
                    userTypeComboBox.getValue());
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Venu Manager.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(CreateAccountSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(CreateAccountSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    
    
    
} 
    
    