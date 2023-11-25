/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudiencePurchaseTicketsSceneController implements Initializable {

    @FXML
    private ComboBox<String> showsNameComboBox;
    @FXML
    private DatePicker dob;
    @FXML
    private ComboBox<Integer> noOfTicket;
    @FXML
    private TextField membershipCode;
    @FXML
    private TextField userIDTextField;
    @FXML
    private Label totalPrice;
    @FXML
    private ComboBox<String> membershipComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showsNameComboBox.getItems().addAll("Nabanna", "Dharmashok","Gobheer Asukh", "Dakghar");
        membershipComboBox.getItems().addAll("YES","NO");
        noOfTicket.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        membershipCode.setDisable(true);
        
    }    

    @FXML
    private void returnHomePage(ActionEvent event) throws IOException {
        Parent mainLCManagementLogInFormParent = FXMLLoader.load(getClass().getResource("AudienceDashboardScene.fxml"));        
        Scene mainLCManagementLogInFormScene = new Scene(mainLCManagementLogInFormParent);        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        stage.setScene(mainLCManagementLogInFormScene);
        stage.show();
    }

    @FXML
    private void purchaseOnClick(ActionEvent event) {
        
    }

    @FXML
    private void membershipOnCilck(ActionEvent event) {
        if(
            membershipComboBox.getValue().equals("YES")){
            membershipCode.setDisable(false);
            }
        else{
            membershipCode.setDisable(true);
        }
    }

    @FXML
    private void totalPriceOnClick(ActionEvent event) {
        if(membershipComboBox.getValue().equals("YES")){
            if("555222888".equals(membershipCode.getText())){
                int numberOfTickets = noOfTicket.getValue();
                int ticketPrice = 800;
                int discount = 50;

                int totalWithDiscount = numberOfTickets * (ticketPrice - discount);

                totalPrice.setText(String.valueOf(totalWithDiscount));    
            }else{
                totalPrice.setText("Membership Code is wrong");
            }
            
        }
        else if(membershipComboBox.getValue().equals("NO")){
            int numberOfTickets = noOfTicket.getValue();
            int ticketPrice = 800;

            int totalWithoutDiscount = numberOfTickets * ticketPrice;

            totalPrice.setText(String.valueOf(totalWithoutDiscount));
        }
    }

    
}
