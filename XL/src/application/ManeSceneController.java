package application;
import java.net.URL; 
import java.util.ResourceBundle; 

import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.fxml.Initializable; 
import javafx.scene.control.Button; 
import javafx.scene.control.PasswordField; 
import javafx.scene.control.TextField; 
import javafx.scene.text.Text;
public class ManeSceneController implements Initializable {
	@FXML
	private Text Text1;
	@FXML
	private TextField Text2;
	@FXML
	private Text Text3;
	@FXML
	private PasswordField Text4;
	@FXML
	private Button Button1;
	@FXML
	private Text Text5;
	String login = "ququ";
	String password = "123321";
	public void initialize (URL location, ResourceBundle resources) {
		
	}
	public void Action1 (ActionEvent event) {
		if (login.equals(Text2.getText()) && password.equals(Text4.getText())) {
			Text5.setText("Correct password");
		}
		else {
			Text5.setText("WrongPassword");
		}
	}
}
