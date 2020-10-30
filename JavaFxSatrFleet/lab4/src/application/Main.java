package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Hassan Ali kfi911
 *
 */
public class Main extends Application {
	private Stage primaryStage;
	private AnchorPane mainLayout;

	/**
	 * override the method that was extended from Application class
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Planets");
		showMainView();

	}

	/**
	 * Setting up the window to be shown
	 * 
	 * @throws IOException
	 */
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/view/Login.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}
}

