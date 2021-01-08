package mainGame;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GUIMain extends Application
{
	//@FXML //must use before declaring variable used in fxml
	//private Text text1;

	//public Button quit, start, menu, menu2, next, next1, next2, next3, choice1, choice2, choice3, choice4;
	Parent root;
	Scene scene;
	public static Stage mainPublic;
	//public static String choice;
	//private int sceneCount = 1;
	
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
		GameRun.player.preInit();
		DataInit.dataInit();
		BattleSystem.preInitEnemy();
		//Font.loadFont(Main.class.getResource("/resource/fonts/TheWildBreathOfZelda-15Lv.ttf").toExternalForm(), 120);
		//FXMLLoader loader = new FXMLLoader();
		root = FXMLLoader.load(getClass().getResource("../resource/scenes/Startmenu.fxml"));
		//loader.setController(this);
		scene = new Scene(root, 1366, 768);
		//scene1.getStylesheets().add(getClass().getResource("/resource/style/styleScene.css").toExternalForm());
		mainStage.setTitle("Adventure");
		mainStage.setScene(scene);
		//mainStage.setMaximized(true);
		mainStage.initStyle(StageStyle.UNDECORATED);
		//mainStage.setFullScreen(true);
		//mainStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		mainStage.show();
		
		
		
		mainPublic = mainStage;
	}
}