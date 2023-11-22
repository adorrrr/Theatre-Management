package mainpkg;

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
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class AudienceUpcomingShowsSceneController implements Initializable {
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void details1OnClick(ActionEvent event) throws IOException {
       Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AudienceUpComingShowsSceneOne.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void details2OnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AudienceUpComingShowsSceneTwo.fxml"));
        Scene Scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
    }

    @FXML
    private void details4OnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AudienceUpComingShowsSceneFour.fxml"));
        Scene Scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
    }

    @FXML
    private void details3OnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AudienceUpComingShowsSceneThree.fxml"));
        Scene Scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
    }

    @FXML
    private void retrunHomePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));
        Scene Scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Scene);
        window.show();
        
    }
    
}
