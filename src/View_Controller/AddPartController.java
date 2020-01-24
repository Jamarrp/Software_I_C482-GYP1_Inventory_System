package View_Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {
    public RadioButton addPartOutsourcedRadio;
    public RadioButton addPartInHouseRadio;
    public TextField addPartIDField;
    public TextField addPartNameField;
    public TextField addPartInvField;
    public TextField addPartPriceField;
    public TextField addPartMaxField;
    public TextField addPartMinField;
    public TextField addPartRadioField;
    public Text addPartRadioText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void inHouseTrue(MouseEvent mouseEvent) {
    }

    public void outsourcedTrue(MouseEvent mouseEvent) {
    }

    public void addPartSave(MouseEvent mouseEvent) {
    }

    public void addPartCancel(MouseEvent mouseEvent) {
    }


}
