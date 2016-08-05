
package conversionfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author Administrator
 */
public class ConversionFXController implements Initializable {
    private final TemperatureConverter converter = new TemperatureConverter();
    
    @FXML private TextArea input;
    @FXML private TextArea output;
    @FXML private ChoiceBox choice;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(choice.getValue().equals("To Fahrenheit"))
        {
            double centigrade = Double.parseDouble(input.getText());
            double fahrenheit = converter.centigradeToFahrenheit(centigrade);
            output.setText(String.format("%2.1f \u00b0F",fahrenheit));  // degree symbol
        }
        else
        {
            double fahrenheit = Double.parseDouble(input.getText());
            double centigrade = converter.fahrenheitToCentigrade(fahrenheit);
            output.setText(String.format("%2.1f \u00b0C",centigrade));  // degree symbol
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
