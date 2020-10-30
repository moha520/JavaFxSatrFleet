/**
 * 
 */
package view;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import application.Main;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ImageList;

/**
 * @author kfi911
 *
 */
public class PersonnelController implements Initializable {
	@FXML
	Button logout;
	@FXML
	TilePane tilePane ;
	@FXML
	VBox vbox = new VBox(5);
	@FXML
	Label name;

	
	
		int nRows=6;
		int ncol=4;
		
		ImageList img = new ImageList();
		
		

	
		public void handle(Event event) {
			
			try {
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		        Stage stage = (Stage) logout.getScene().getWindow();
		        Scene scene = new Scene(loader.load());
		        stage.setScene(scene);
		    }catch (IOException io){
		        io.printStackTrace();
		    }
			
	    	  
			
		}
		
		
		public void showPersonnel(Button btn) throws IOException{
		
	       
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Personnel.fxml"));
		        Stage stage = (Stage) btn.getScene().getWindow();
		        Scene scene = new Scene(loader.load());
		       
		        stage.setScene(scene);
		        
		        
		    
		}
		//Image image = new Image("images/images/chakotay.jpg");

		@Override
		public void initialize(URL location, ResourceBundle resources) {
	
			try {
				img.loadImg();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
	tilePane.setHgap(18);
	tilePane.setVgap(18);
	tilePane.setPrefColumns(4);
	tilePane.setPrefRows(6);
	
	for (int i=0;i<img.imageList.size();i++){
		Image image = new Image("file:"+img.imageList.get(i),140,150,false,false);
		tilePane.getChildren().add(new ImageView(image));
		System.out.println(img.imageList.get(i));
	}
	
			
//			for(int i=0;i<img.imageList.size();i++){
//				//Image myImg = new Image(img.imageList.get(i)));
//				//Image image = new Image(img.imageList.get(i).getName());
//				System.out.println(img.imageList.get(i));
//				
//			}
			
		}
		
		

}
