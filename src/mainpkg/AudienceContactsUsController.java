/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author World gate computer
 */
public class AudienceContactsUsController implements Initializable {

    @FXML
    private ComboBox<String> selectVenueCombocox;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectVenueCombocox.getItems().addAll("Chittagong",
                "Dhaka"
                );
    }    


    @FXML
    private void selectVenueComboBoxOnItemSelected(ActionEvent event) {
        if(selectVenueCombocox.getValue().equals("Dhaka")) {
        BufferedReader reader = null;
        try {outputTextArea.clear();
            // Replace "yourFileName.txt" with the actual file name and path
            String fileName = "Venue Contacts/Dhaka.txt";
            
            // FileReader is used to read the text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
            
            // Wrap FileReader in BufferedReader for efficient reading.
            reader = new BufferedReader(fileReader);
            
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming fields are separated by commas (`,`). Adjust accordingly.
                String[] tokens = line.split(",");
                
                // Do something with the tokens, e.g., print them
                outputTextArea.appendText(
                        "Address: " + tokens[0]+"\n"
                        + "Number: " + tokens[1]+"\n"
                        + "Mail: " + tokens[2]);
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
        
        else if(selectVenueCombocox.getValue().equals("Chittagong")) {
        BufferedReader reader = null;
        try {outputTextArea.clear();
            // Replace "yourFileName.txt" with the actual file name and path
            String fileName = "Venue Contacts/Chittagong.txt";
            
            // FileReader is used to read the text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
            
            // Wrap FileReader in BufferedReader for efficient reading.
            reader = new BufferedReader(fileReader);
            
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming fields are separated by commas (`,`). Adjust accordingly.
                String[] tokens = line.split(",");
                
                // Do something with the tokens, e.g., print them
                outputTextArea.appendText(
                        "Address: " + tokens[0]+"\n"
                        + "Number: " + tokens[1]+"\n"
                        + "Mail: " + tokens[2]); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        }else {
        outputTextArea.clear();
        }
        
}
    
}
