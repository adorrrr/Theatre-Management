package mainpkg;


import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;




public class DirectorBudgetSceneController implements Initializable {

    @FXML private PieChart pieChart;
    @FXML private TextField newIDepName;
    @FXML private TextField newBudgetValue;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void addNewBudgetToChartOnClick(ActionEvent event) {  
        PieChart.Data newBudget =new PieChart.Data(newIDepName.getText(),
                Double.parseDouble(newBudgetValue.getText()));
        pieChart.getData().add(newBudget);
        
        
        File dic = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            dic = new File("cost.bin");
            if(dic.exists()) fos = new FileOutputStream(dic,true);
            else fos = new FileOutputStream(dic);           

            dos = new DataOutputStream(fos);
            
            dos.writeUTF(newIDepName.getText());
            dos.writeUTF(newBudgetValue.getText());
            
            String formattedDate = LocalDate.now().toString(); 
            dos.writeUTF(formattedDate);
            
            newIDepName.clear();
            newBudgetValue.clear();
        } 
        
        catch (IOException ex) {
            Logger.getLogger(DirectorBudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        finally {
            try {
                if(dos != null) dos.close();
            } 
            
            catch (IOException ex) {
                Logger.getLogger(DirectorBudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void returHomePage(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }
    
}
