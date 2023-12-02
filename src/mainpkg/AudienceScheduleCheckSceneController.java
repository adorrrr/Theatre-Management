package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
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




public class AudienceScheduleCheckSceneController implements Initializable {

    @FXML private TableView<ShowsInfo> tableView;
    @FXML private TableColumn<ShowsInfo, String> showNameColumn;
    @FXML private TableColumn<ShowsInfo, String> vanueColumn;
    @FXML private TableColumn<ShowsInfo, LocalDate> dateColumn;
    @FXML private TableColumn<ShowsInfo, String> timeColumn;
    @FXML private TableColumn<ShowsInfo, Float> priceColumn;


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void addTableViewOnClick(ActionEvent event) throws IOException {
        ObservableList<ShowsInfo>ShowList= FXCollections.observableArrayList();
        showNameColumn.setCellValueFactory(new PropertyValueFactory<ShowsInfo,String>("showName"));
        vanueColumn.setCellValueFactory(new PropertyValueFactory<ShowsInfo,String>("vanue"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<ShowsInfo,LocalDate>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<ShowsInfo,String>("time"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<ShowsInfo,Float>("price"));
        
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Products.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ShowsInfo p;
            try {
                while (true) {
                    p = (ShowsInfo) ois.readObject();
                    ShowList.add(p);
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
        tableView.setItems(ShowList);
    }

    @FXML
    private void returnHomePage(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
