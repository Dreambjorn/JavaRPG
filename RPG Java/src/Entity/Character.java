package Entity;

public class Character 
{
	private String name;
	//private int baseHp; // -> hp of player/enemy at level 1(changes per level)
	//private int maxHp; // -> max hp of player/enemy
	//private int crrHp; // -> current hp of player/enemy
	//private int baseExp; // -> exp one gets from defeating an enemy(changes per level)
	//private int crrExp; // -> current exp of player
	//private int atk;
	private int eqItem; //-> id of equipped item
	
	public Character(String name, int eqItem)
	{
		this.name = name;
		this.eqItem = eqItem;
	}
	
	public String getName()
	{
		return name;
	}
	
	/*public int getAtk()
	{
		return atk;
	}
	
	public void setAtk(int modifier)
	{
		this.atk += modifier;
	}*/
	
	/*public int getMaxHp()
	{
		return maxHp;
	}*/
	
	/*public int getCrrHp()
	{
		return crrHp;
	}*/
	
	/*public void setMaxHp(int modifier)
	{
		this.maxHp += modifier;
	}*/
	
	/*public void setCrrHp(int modifier)
	{
		this.crrHp -= modifier;
	}*/
	
	public int getEqItem()
	{
		return eqItem;
	}
	
	public void setEqItem(int id)
	{
		this.eqItem = id;
	}
	
	public Character()
	{		
	} // -> maybe will be used(?)
}
