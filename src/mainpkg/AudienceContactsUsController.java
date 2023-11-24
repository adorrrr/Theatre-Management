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
        outputTextArea.setText("");
        outputTextArea.clear();
        
        File f = null;
        FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        
        try {
            f = new File("Venue Contacts/Dhaka.txt");
            sc = new Scanner(f);
            if(f.exists()){
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");

                    
                outputTextArea.appendText(
                        "Address: " + tokens[0]+"\n"
                        + "Number: " + tokens[1]+"\n"
                        + "Mail: " + tokens[2]);
                }
            }
        }
        
        catch (IOException ex) {
            Logger.getLogger(AudienceContactsUsController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }  
        }
        
        
        else if(selectVenueCombocox.getValue().equals("Chittagong")) {
        BufferedReader reader = null;
        try {outputTextArea.clear();
            //the actual file name and path
            String fileName = "Venue Contacts/Chittagong.txt";
            
            FileReader fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                
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

    @FXML
    private void rerturnHomePage(ActionEvent event) {
    }
    
}
