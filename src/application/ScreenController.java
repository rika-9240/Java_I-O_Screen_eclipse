package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ScreenController {
    @FXML private Button outputButton;
    @FXML private Label outputLabel;
    @FXML private TextField inputText;
    TextField tf = new TextField("");
    
    @FXML 
    protected void onButtonClick(ActionEvent evt) {
        if(inputText != null && outputButton.getText().equals("表示する")) {
        outputLabel.setText(inputText.getText());
        outputButton.setText("clear");
        }else {
            outputLabel.setText("");
            outputButton.setText("表示する");
        }
        
    }
    
    
    
	
}
