package MainGame;
import ItemDatabase.ItemList;

import java.util.Random;
import java.util.Scanner;
import Entity.PlayerClass;
import Entity.EnemyList;

public class GameRun 
{
	public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		//String role = input.nextLine();
	
		PlayerClass player = new PlayerClass("Waifu", 0, "W");
		EnemyList enemy = new EnemyList();
		ItemList itemId = new ItemList();
	
		enemy.enemyData(1);
		itemId.itemData(player.getEqItem());
	
		player.setMaxAtk(ItemList.itemData.getAtk());
		enemy.enemyData.setMaxAtk(ItemList.itemData.getAtk());
		player.toString();
		enemy.enemyData.toString();
		//input.close();
	
		//while(player.getBaseHp() != 0 && enemy.getBaseHp() != 0)
		//{
			enemy.enemyData.setCrrHp(player.getMaxAtk());
			Random rand = new Random();
			int random = 18 + rand.nextInt(55);
			if(random >= 50)
				player.setCrrHp(enemy.enemyData.getMaxAtk());
			System.out.println(player.getCrrHp());
			System.out.println(enemy.enemyData.getCrrHp());
		//}
	}
}
