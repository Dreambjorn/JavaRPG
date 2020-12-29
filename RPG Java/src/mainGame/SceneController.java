package mainGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SceneController extends Stage
{
	//must use before declaring variable used in fxml
	@FXML private Text hp = new Text(); //needs to be initialized before being modified
	@FXML private Text attack = new Text();
	@FXML public Button quit, start, menu, next, next1, next2, 
						next3, choice1, choice2, choice3, choice4,
						playerNext1, playerNext2, male, female,
						male1, female1, male2, female2;
	Parent root;
	Scene scene;
	//Stage main;
	public static String choice;
	
	@FXML
	public void initialize()
	{
		 hp.setText("HP: " + String.valueOf(GameRun.player.getMaxHp()));
		 attack.setText("ATTACK: " + String.valueOf(GameRun.player.getMaxAtk()));
	}
	
	public void handleQuit()
	{
		System.exit(0);
	}
	
	public void handleStart(ActionEvent event) throws Exception 
	{
        //Stage stage = null;
        //Parent root = null;
       
        if(event.getSource()==start)
        {
        	//title.setText("TEXT"); //working
            GUIMain.mainPublic = (Stage) start.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../resource/scenes/FirstScene.fxml"));
            //Scale scale = new Scale(1, 1, 0, 0);
    		//root.getTransforms().add(scale);
            GUIMain.mainPublic.getScene().setRoot(root);
        }
        //title.setText("TEXTgtt");
       /* if(event.getSource()==start1)
        {
            stage = (Stage) start1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
        } //for changing scenes -> different ids for every particular button that changes a scene
        */
        //Scene scene = new Scene(root);
        //stage.setScene(scene);
        //stage.setMaximized(true);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
       // stage.show();
    }
	
	public void handleChar(ActionEvent event) throws Exception
	{
		//Stage stage = null;
        //Parent root = null;
        
        if(event.getSource() == male) 
        {	
        	GUIMain.mainPublic = (Stage) male.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene1m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == female) 
        {	
        	GUIMain.mainPublic = (Stage) female.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene1f.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == male1) 
        {	
        	GUIMain.mainPublic = (Stage) male1.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene2m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == female1) 
        {	
        	GUIMain.mainPublic = (Stage) female1.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene2f.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == male2) 
        {	
        	GUIMain.mainPublic = (Stage) male2.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene3m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == female2) 
        {	
        	GUIMain.mainPublic = (Stage) female2.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene3f.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        //Scene scene = new Scene(root);
        //stage.setScene(scene);
        //stage.setMaximized(true);
        //stage.show();
	}
	public void handleNext(ActionEvent event) throws Exception 
	{
		//Stage stage = null;
        //Parent root = null;
        
        if(event.getSource() == menu) 
        {	
        	GUIMain.mainPublic = (Stage) menu.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/Startmenu.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        	DataInit.resetData();
        }
        
        else if(event.getSource() == next)
        {
        	GUIMain.mainPublic = (Stage) next.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/SecondScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == next1)
        {
        	GUIMain.mainPublic = (Stage) next1.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/ThirdScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == next2)
        {
        	GUIMain.mainPublic = (Stage) next2.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/FourthScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == next3)
        {
        	GUIMain.mainPublic = (Stage) next3.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/ChoiceScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == choice1)
        {
        	GUIMain.mainPublic = (Stage) choice1.getScene().getWindow();
        	choice = "Fight for your life";
        	GameRun.run();
        	hp.setText("HP: " + String.valueOf(GameRun.player.getMaxHp()));
   		 	attack.setText("ATTACK: " + String.valueOf(GameRun.player.getMaxAtk()));
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene1m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        	//System.out.println(choice);
        	//initialize();
        }
        
        else if(event.getSource() == choice2)
        {
        	GUIMain.mainPublic = (Stage) choice2.getScene().getWindow();
        	choice = "Pray to the gods";
        	GameRun.run();
        	hp.setText("HP: " + String.valueOf(GameRun.player.getMaxHp()));
   		 	attack.setText("ATTACK: " + String.valueOf(GameRun.player.getMaxAtk()));
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene2m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == choice3)
        {
        	GUIMain.mainPublic = (Stage) choice3.getScene().getWindow();
        	choice = "Conceal your presence";
        	GameRun.run();
        	hp.setText("HP: " + String.valueOf(GameRun.player.getMaxHp()));
   		 	attack.setText("ATTACK: " + String.valueOf(GameRun.player.getMaxAtk()));
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/CharScene3m.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == choice4)
        {
        	GUIMain.mainPublic = (Stage) choice4.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/EndScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == playerNext1)
        {
        	GUIMain.mainPublic = (Stage) playerNext1.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/PlayerScene1.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        //Scene scene = new Scene(root);
        //stage.setScene(scene);
        //stage.setMaximized(true);
        //stage.show();
        
		/*sceneCount ++;
		switch(sceneCount)
		{
			case 2:
				text.setText("But a miscalculation resulted in the discrenspency of the device, and you've been dragged into the portal.");
				break;
			case 3:
				text.setText("You got on a silent grain field. You stand there for some time, trying to understand what's happening. The wind starts blowing from behind you.");
				break;
			case 4:
				text.setText("Suddenly you notice some strange figures in your sight. Your instinct tells you that something bad is going to happen.");
		}*/
	}
	
}
