package mainGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SceneController extends Stage
{
	//must use before declaring variable used in fxml
	@FXML private Text hp = new Text(); //needs to be initialized before being modified
	@FXML private Text attack = new Text();
	@FXML private Text name = new Text();
	@FXML private Text hpGoblin = new Text();
	@FXML private Text hpPlayer = new Text();
	@FXML private Text textBattleEnemy = new Text();
	@FXML private Text textBattlePlayer = new Text();
	@FXML public Button quit, start, menu, next, next1, next2, 
						next3, choice1, choice2, choice3, choice4,
						playerNext1, playerNext2, male, female,
						male1, female1, male2, female2, attackButton,
						fleeButton, itemPopup, ok1, ok2, endGame;
	Parent root;
	Scene scene;
	static Stage popup = new Stage();
	//Stage main;
	public static String choice;
	public boolean checkMenu = false;
	
	@FXML
	public void initialize()
	{
		hp.setText("HP: " + String.valueOf(GameRun.player.getMaxHp()));
		attack.setText("ATTACK: " + String.valueOf(GameRun.player.getMaxAtk()));
		hpPlayer.setText("HP: " + String.valueOf(GameRun.player.getCrrHp()) + " / " 
				 		+ String.valueOf(GameRun.player.getMaxHp()));
		
		name.setText(GameRun.player.getName().toUpperCase());
		hpGoblin.setText("");
		textBattlePlayer.setText("BATTLE HAS BEGUN");
		textBattleEnemy.setText("");
		//hpGoblin.setText("");
		//hpGoblin.setText("HP: " + String.valueOf(BattleSystem.crrEnemy.getCrrHp()) + " / " 
		//		 		+ String.valueOf(BattleSystem.crrEnemy.getMaxHp()));
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
	
	public void handleBattle(ActionEvent event) throws Exception 
	{
		if(event.getSource() == attackButton) 
		{
			BattleSystem.manualBattle(1, 3);
			
			name.setText(GameRun.player.getName().toUpperCase());
			hpPlayer.setText("HP: " + String.valueOf(GameRun.player.getCrrHp()) + " / " 
			 					+ String.valueOf(GameRun.player.getMaxHp()));
			
			if(BattleSystem.checkBattle == false)
			{
				hpGoblin.setText("HP: " + String.valueOf(BattleSystem.crrEnemy.getCrrHp()) + " / " 
						+ String.valueOf(BattleSystem.crrEnemy.getMaxHp()));
				
				if(BattleSystem.hitCheck)
					textBattleEnemy.setText("GOBLIN DEALT " + String.valueOf(BattleSystem.crrEnemy.getMaxAtk()) + " DAMAGE");
				else
					textBattleEnemy.setText("GOBLIN MISSED");
			}		
			else
				{
				hpGoblin.setText("HP: 0" + " / " 
						+ String.valueOf(BattleSystem.crrEnemy.getMaxHp()));
				textBattleEnemy.setText("GOBLIN DIED");
				}
						
			
			textBattlePlayer.setText("YOU DEALT " + String.valueOf(GameRun.player.getMaxAtk()) + " DAMAGE");
			
			
			/*if(BattleSystem.checkBattle == true)
				DataInit.resetData();*/
			if(BattleSystem.crrEnemy.getCrrHp() <= 0)
			{
				Parent rpopup = null;
				
				rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Reward1.fxml"));
				popup = new Stage();
				
				if(popup.getStyle() == StageStyle.TRANSPARENT)
				{
					popup.show();
				}
				
				else
				{
					Scene scene = new Scene(rpopup);
					scene.setFill(Color.TRANSPARENT);
		    		popup.setScene(scene);
		    		popup.initStyle(StageStyle.UNDECORATED);
		    		popup.initStyle(StageStyle.TRANSPARENT);
		    		popup.show();
				}
			}
			
			else if(BattleSystem.player.getCrrHp() <= 0)
			{
	        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/EndScene.fxml"));
	        	GUIMain.mainPublic.getScene().setRoot(root);
			}
		}
		
		else if(event.getSource() == fleeButton) 
		{
			root = FXMLLoader.load(getClass().getResource("../resource/scenes/EndScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
		}
	}
	
	public void handlePopup(ActionEvent event) throws Exception 
	{
		Parent rpopup = null;
		if(event.getSource() == itemPopup) 
        {	
        	switch(GameRun.player.getRole())
        	{
        	case "W":
        		rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Sword1.fxml"));
				break;
			case "R":
				rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Bow1.fxml"));
				break;
			case "M":
				rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Staff1.fxml"));
				break;	
        	}	        	
        }	
		
		if(event.getSource() == itemPopup) 
        {	
        	switch(GameRun.player.getRole())
        	{
        	case "W":
        		rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Sword1.fxml"));
				break;
			case "R":
				rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Bow1.fxml"));
				break;
			case "M":
				rpopup = FXMLLoader.load(getClass().getResource("../resource/scenes/Staff1.fxml"));
				break;	
        	}	        	
        }	
		//System.out.println(popup.getStyle());
		
		if(popup.getStyle() == StageStyle.TRANSPARENT)
		{
			popup.show();
		}
		
		else
		{
			Scene scene = new Scene(rpopup);
			scene.setFill(Color.TRANSPARENT);
    		popup.setScene(scene);
    		popup.initStyle(StageStyle.UNDECORATED);
    		popup.initStyle(StageStyle.TRANSPARENT);
    		popup.show();
		}
	}

	public void handleClosePopup(ActionEvent event) throws Exception 
	{
		
		if(event.getSource() == ok1) 
        {	
    		popup.close();
    		root = FXMLLoader.load(getClass().getResource("../resource/scenes/BattleScene.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
		
		if(event.getSource() == ok2) 
        {	
    		popup.close();
    		root = FXMLLoader.load(getClass().getResource("../resource/scenes/PlayerScene2.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
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
        	BattleSystem.checkPlayer = false;
        	BattleSystem.checkQt = false;
        	BattleSystem.checkBattle = false;
        	BattleSystem.hitCheck = false;
        	checkMenu = true;
        	popup = new Stage();
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
        	DataInit.resetData();
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
        	DataInit.resetData();
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
        	DataInit.resetData();
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
        
        else if(event.getSource() == playerNext2)
        {
        	GUIMain.mainPublic = (Stage) playerNext2.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/PlayerScene3.fxml"));
        	GUIMain.mainPublic.getScene().setRoot(root);
        }
        
        else if(event.getSource() == endGame)
        {
        	GUIMain.mainPublic = (Stage) endGame.getScene().getWindow();
        	root = FXMLLoader.load(getClass().getResource("../resource/scenes/EndGame.fxml"));
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
