package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Container;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import MainGame.BattleSystem;

public class Interface 
{
	JFrame window;
	Container con;
	JPanel returnButtonPanel, titlePanel, startButtonPanel, exitButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleLabel, hpLabel, nameLabel, weaponLabel;
	JButton returnButton, startButton, exitButton, choice1, choice2, choice3, choice4;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font commFont = new Font("Times New Roman", Font.PLAIN, 30);
	Font statsFont = new Font("Times New Roman", Font.PLAIN, 30);
	JTextArea mainTextArea;
	
	//GraphicsDevice gDevice;
	
	//FullScreenHandler fsHandler = new FullScreenHandler();
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	BattleSystem game;
	
	public static void main(String[] args)
	{
		new Interface();
	}
	
	public Interface()
	{
		//GraphicsEnvironment gEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		//gDevice = gEnvironment.getDefaultScreenDevice();
		//int width = gDevice.getDisplayMode().getWidth();
		//int height = gDevice.getDisplayMode().getHeight();
		
		window = new JFrame();
		window.setUndecorated(true);
		
        window.setBounds(0,0,window.getToolkit().getScreenSize().width,window.getToolkit().getScreenSize().height);
		//window.setSize(800, 600);
		//window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//window.setUndecorated(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		/*int tmpX = (int) Math.round(width * 100 / width);
		int tmpY = (int) Math.round(height * 100 / height);
		int tmpW = (int) Math.round(width * 600 / width);
		int tmpH = (int) Math.round(height * 150 / height);*/
		
		titlePanel = new JPanel();
		//titlePanel.setBorder(new EmptyBorder(10,10,10,10));
		//titlePanel.setBounds(tmpX, tmpY, tmpW, tmpH);
		titlePanel.setBounds(340, 100, 600, 150);
		titlePanel.setBackground(Color.red);
		titleLabel = new JLabel("ADVENTURE");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(520, 500, 230, 60);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START GAME");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(commFont);
		startButton.setActionCommand("start");
		startButton.setFocusPainted(false);
		startButton.addActionListener(tsHandler);
		
		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(520, 560, 230, 80);
		exitButtonPanel.setBackground(Color.black);
		
		exitButton = new JButton("  EXIT GAME  ");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(commFont);
		exitButton.setActionCommand("exit");
		exitButton.setFocusPainted(false);
		exitButton.addActionListener(tsHandler);
		
		con.add(titlePanel);
		con.add(startButtonPanel);
		con.add(exitButtonPanel);
		exitButtonPanel.add(exitButton);
		startButtonPanel.add(startButton);
		titlePanel.add(titleLabel);	
		window.setVisible(true);
		window.setLayout(new BorderLayout());
		//gDevice.setFullScreenWindow(window);
		
	}
	
	
	public void createGameScreen()
	{
		titlePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		exitButtonPanel.setVisible(false);
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(320, 150, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("Are you ready to go on an adventure mate?");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(commFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(480, 550, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFocusPainted(false);
		choice1.setFont(commFont);
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFocusPainted(false);
		choice2.setFont(commFont);
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFocusPainted(false);
		choice3.setFont(commFont);
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFocusPainted(false);
		choice4.setFont(commFont);
		
		choiceButtonPanel.add(choice1);
		choiceButtonPanel.add(choice2);
		choiceButtonPanel.add(choice3);
		choiceButtonPanel.add(choice4);
		
		returnButtonPanel = new JPanel();
		returnButtonPanel.setBounds(1150, 0, 230, 80);
		returnButtonPanel.setBackground(Color.black); 
		
		returnButton = new JButton("  MENU  "); // -> needs changes
		returnButton.setBackground(Color.black);
		returnButton.setForeground(Color.white);
		returnButton.setFont(commFont);
		returnButton.setActionCommand("menu");
		returnButton.setFocusPainted(false);
		returnButton.addActionListener(tsHandler);
		con.add(returnButtonPanel);
		returnButtonPanel.add(returnButton);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(50, 15, 500, 100);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(3, 1));
		con.add(playerPanel);
		
		game = new BattleSystem();
		game.Battle();
		nameLabel = new JLabel("Name: " + game.name);
		nameLabel.setFont(commFont);
		nameLabel.setForeground(Color.white); // -> player name
		playerPanel.add(nameLabel);
		
		hpLabel = new JLabel("HP: " + game.hp);
		hpLabel.setFont(statsFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);	// -> hp of player	
		
		weaponLabel = new JLabel("Weapon: " + game.weapon);
		weaponLabel.setFont(statsFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel); // -> equipped weapon		
		
		//playerSetup();
	}
	
	/*public void playerSetup()
	{
		game = new BattleSystem();
		game.Battle();
		weaponLabelName.setText(game.weapon);
	}*/
	
	public class TitleScreenHandler implements ActionListener
	{	
		public void actionPerformed(ActionEvent event)
		{
			if (event.getActionCommand() == "start") 
			{
				createGameScreen();
			} 
			else if (event.getActionCommand() == "exit") 
			{
				System.exit(0);
			}
			else if (event.getActionCommand() == "menu") 
			{
				//new Interface();
			}
		}
	}
}
