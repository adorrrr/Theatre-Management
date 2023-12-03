package mainpkg;


import java.io.File;
import java.io.FileInputStream;
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






public class DirectorMonthlyReportSceneController implements Initializable {

    @FXML
    private TableView<BudgetDC> tableView;
    @FXML
    private TableColumn<BudgetDC, String> departmentCol;
    @FXML
    private TableColumn<BudgetDC, Integer> budgetCol;


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnHomePageOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("DirectorDashboardScene.fxml"));
        Scene scene = new Scene(parent);
        Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg.setScene(scene);
        stg.show();
    }

    @FXML
    private void loadOnClick(ActionEvent event) {
        ObservableList<BudgetDC> budgetList = FXCollections.observableArrayList();
        departmentCol.setCellValueFactory(new PropertyValueFactory<BudgetDC, String>("department"));
        budgetCol.setCellValueFactory(new PropertyValueFactory<BudgetDC, Integer>("budget"));
        

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("cost.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            BudgetDC p;
            try {
                while (true) {
                    p = (BudgetDC) ois.readObject();
                    budgetList.add(p);
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
        tableView.setItems(budgetList);
    }
    
}
