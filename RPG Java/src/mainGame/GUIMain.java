package mainGame;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GUIMain extends Application
{
	@FXML //must use before declaring variable used in fxml
	Label title;
	
	public Button quit, start, menu;
	Parent root;
	Scene scene;
	Stage main;
	
	public static void main(String[] args)
	{
		launch();
	}
	
	@Override
	public void start(Stage mainStage) throws IOException
	{
		//Parent root1[] = new Parent[100];
		//String arrayXML[] = new String[100];
		//se citesc denumirile XML dintr-un file in array-ul arrayXML
		/*for(int i = 0; i < 1; i++)
			root1[i] = FXMLLoader.load(getClass().getResource(arrayXML[i]));*/
		
		//Font.loadFont(Main.class.getResource("/resource/fonts/TheWildBreathOfZelda-15Lv.ttf").toExternalForm(), 120);
		root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
		scene = new Scene(root, 1366, 768);
		//scene1.getStylesheets().add(getClass().getResource("/resource/style/styleScene.css").toExternalForm());
		mainStage.setTitle("Adventure");
		mainStage.setScene(scene);
		//mainStage.setMaximized(true);
		//mainStage.initStyle(StageStyle.UNDECORATED);
		//mainStage.setFullScreen(true);
		//mainStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		mainStage.show();
	}
    
	public void handleQuit()
	{
		System.exit(0);
	}
	
	public void handleStart(ActionEvent event) throws Exception 
	{
        Stage stage = null;
        Parent root = null;
       
        if(event.getSource()==start)
        {
        	//title.setText("TEXT"); //working
            stage = (Stage) start.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
            
        }
        //title.setText("TEXTgtt");
       /* if(event.getSource()==start1)
        {
            stage = (Stage) start1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
        } //for changing scenes -> different ids for every particular button that changes a scene
        */
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        stage.show();
    }
	
	public void handleMenu(ActionEvent event) throws Exception 
	{
		Stage stage = null;
        Parent root = null;
        
        stage = (Stage) menu.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
	
	public void handleNext(ActionEvent event) throws Exception 
	{
		Stage stage = null;
        Parent root = null;
        
        stage = (Stage) menu.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("SecondScene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
}
