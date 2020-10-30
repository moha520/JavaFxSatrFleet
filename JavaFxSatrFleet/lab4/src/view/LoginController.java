package view;

import java.io.IOException;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Users;

public class LoginController implements EventHandler<Event> {
	@FXML
	private TextField userName;
	@FXML
	private TextField passwd;
	@FXML
	private Button login;
	@FXML
	private Label status;

	Users user = new Users();
	
	PersonnelController personnel = new PersonnelController();

	/**
	 * override handle method that was in EventHandler
	 */
	@Override
	public void handle(Event event) {
	
		try {
			user.validate(userName.getText(), passwd.getText());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		if (user.isGrantAccess()) {
			try {
				personnel.showPersonnel(login);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			userName.setText("");
			passwd.setText("");
			status.setText("");

		} else {
			status.setText("Login Failed!");
		}
		

	}

}
