/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudienceUpComingShowsSceneThreeController implements Initializable {

    @FXML
    private TableView<ShowsInfo> detailsTableView;
    @FXML
    private TableColumn<ShowsInfo, String> detailsBoard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        detailsBoard.setCellValueFactory(new PropertyValueFactory<>("text"));
    }    

    @FXML
    private void retrunUpcomingShowsScene(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("AudienceUpcomingShowsScene.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                //This line gets the Stage information
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
    }

    @FXML
    private void loadDetailsButtonOnClick(ActionEvent event) throws IOException {
        ShowsInfo selectedItem = detailsTableView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) 
        {
            detailsTableView.getItems().remove(selectedItem);
            
            FileWriter fw = new FileWriter("UpComingShowsSceneThree.txt");
            
            for(ShowsInfo msg: detailsTableView.getItems())
            {
                fw.write(msg.getText() + "\n");
            }
            fw.close();
        }
    }
    
}
