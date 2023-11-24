/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudienceScheduleCheckSceneController implements Initializable {

    @FXML
    private TableView<ShowsInfo> tableView;
    @FXML
    private TableColumn<ShowsInfo, String> showNameColumn;
    @FXML
    private TableColumn<ShowsInfo, String> vanueColumn;
    @FXML
    private TableColumn<ShowsInfo, LocalDate> dateColumn;
    @FXML
    private TableColumn<ShowsInfo, Float> timeColumn;
    @FXML
    private TableColumn<ShowsInfo, Float> priceColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showNameColumn.setCellValueFactory(new PropertyValueFactory<>("showName"));
        vanueColumn.setCellValueFactory(new PropertyValueFactory<>("vanue"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }    

    @FXML
    private void addTableViewOnClick(ActionEvent event) throws IOException {

    /*    ShowsInfo selectedItem = tableView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) 
        {
            tableView.getItems().remove(selectedItem);
            
            File file = new File("binary_file_path.bin");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileWriter fw = new FileWriter("UpComingShowsSceneOne.txt");
            
            for(ShowsInfo msg: tableView.getItems())
            {
                file.write(msg.getShowName() + msg.getVanue() + msg.getDate() + msg.getTime() + msg.getPrice());
            }
            file.close();
        }*/
        
    }
    
}
