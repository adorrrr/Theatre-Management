package mainpkg;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;




public class AudienceUpComingShowsSceneThreeController implements Initializable {
    @FXML private TableView<ShowsInfo> detailsTableView;
    @FXML private TableColumn<ShowsInfo, String> detailsBoard;


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void retrunUpcomingShowsScene(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("AudienceUpcomingShowsScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);

                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
    }

    @FXML
    private void loadDetailsButtonOnClick(ActionEvent event) throws IOException {
        ObservableList<ShowsInfo> ShowsList = FXCollections.observableArrayList();
        detailsBoard.setCellValueFactory(new PropertyValueFactory<ShowsInfo, String>("text"));
       
        

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Gobheer Asukh.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ShowsInfo p;
            try {
                while (true) {
                    p = (ShowsInfo) ois.readObject();
                    ShowsList.add(p);
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
        detailsTableView.setItems(ShowsList);
    }
}
    

