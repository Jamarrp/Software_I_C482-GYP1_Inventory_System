package View_Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    public TableView partTable;
    public TableColumn partIDCol;
    public TableColumn partNameCol;
    public TableColumn partInvCol;
    public TableColumn partPriceCol;
    public TextField partSearchBox;
    public TableView productTable;
    public TableColumn productIDCol;
    public TableColumn productNameCol;
    public TableColumn productInvCol;
    public TextField productSearchBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void searchParts(MouseEvent mouseEvent) {
    }

    public void searchProducts(MouseEvent mouseEvent) {
    }

    public void addParts(MouseEvent mouseEvent) {
    }

    public void modifyParts(MouseEvent mouseEvent) {
    }

    public void deleteParts(MouseEvent mouseEvent) {
    }

    public void addProducts(MouseEvent mouseEvent) {
    }

    public void modifyProducts(MouseEvent mouseEvent) {
    }

    public void deleteProducts(MouseEvent mouseEvent) {
    }

    public void exitInvProgram(MouseEvent mouseEvent) {
    }
}
