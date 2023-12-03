package mainpkg;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



public class DirectorChatBoxSceneController implements Initializable {

    @FXML private TextArea messageTextField;
    @FXML private TableView<Chat> tableView;
    @FXML private TableColumn<Chat, String> departmentCol;
    @FXML private TableColumn<Chat, String> messageCol;
    @FXML private TextField depaetmentTextField;

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void massageSentOnChick(ActionEvent event) {
        Chat i = new Chat(messageTextField.getText(), depaetmentTextField.getText() );
        
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f = null;
        try {
            f = new File("Chat.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(i);
            

        } catch (IOException ex) {
            Logger.getLogger(DirectorChatBoxSceneController.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();

                }
            } catch (IOException ex) {
                Logger.getLogger(DirectorChatBoxSceneController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @FXML
    private void loadOnClick(ActionEvent event) {
        ObservableList<Chat> ChatList = FXCollections.observableArrayList();
        departmentCol.setCellValueFactory(new PropertyValueFactory<Chat, String>("Department"));
        messageCol.setCellValueFactory(new PropertyValueFactory<Chat, String>("massage"));
        

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Chat.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Chat p;
            try {
                while (true) {
                    p = (Chat) ois.readObject();
                    ChatList.add(p);
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
        tableView.setItems(ChatList);
    }
    
    

    @FXML
    private void returnHomePage(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }
    
}
