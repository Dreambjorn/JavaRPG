package mainGame;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SceneController extends GUIMain
{
	public Button quit;
	public Button display;
	public boolean check = true;
    
	public void handleQuit()
	{
		System.exit(0);
	}
	
	public void handleDisplay(ActionEvent event) throws IOException
	{
		Stage stage; 
	    Parent root;
	    if(event.getSource()==display)
	    {
	        //get reference to the button's stage         
	        stage=(Stage) display.getScene().getWindow();
	        //load up OTHER FXML document
	        root = FXMLLoader.load(getClass().getResource("xml2.fxml"));
	    }
	    else
	    {
	        stage=(Stage) display.getScene().getWindow();
	        root = FXMLLoader.load(getClass().getResource("xml.fxml"));
	    }
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	    stage.setFullScreen(true);
	}
}
