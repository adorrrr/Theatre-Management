package mainpkg;

import java.io.File;
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
        if(userTypeComboBox.getValue().equals("General Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("General Manager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Producer")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Producer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Dirctor")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Dirctor.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Production Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Production Manager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Artist")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Artist.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Marketing Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Marketing Manager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Venu Manager")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Venu Manager.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource(".fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    }else {
                        Alert();
                        }
                    
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
    }
        if(userTypeComboBox.getValue().equals("Audience")){
            File f = null;
            FileInputStream fis = null;
            ObjectInputStream ois = null;

        try {
            f = new File("Audience.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User p;
            try {
                while (true) {
                    p = (User) ois.readObject();
                    if (String.valueOf(p.getID()).equals(idTextField.getText()) && p.getPassword().equals(passwordTextField.getText())) {
                        Parent A = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
                        Scene sceneA = new Scene(A);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(sceneA);                      
                        stage.show();
                    } else {
                        Alert();
                        }
                    
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
        Alert a2 = new Alert(Alert.AlertType.WARNING);
        a2.setTitle("Warning ");
        a2.setHeaderText("LogIn Failed");
        a2.setContentText("Wrong ID/Password. Please Try Again");
        a2.showAndWait();
        }
    
}