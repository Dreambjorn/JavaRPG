package entity;

public class Enemy extends Character
{
	private int baseHp;
	private int baseExp;
	private String description;
	private int baseAtk;
	private int maxAtk;
	private int maxHp;
	private int crrHp;
	private int lootId;
	
	public Enemy(String name, int baseAtk, String description, 
			int eqItem, int baseHp, int baseExp, int loot)
	{
		super(name, eqItem);
		this.description = description;
		this.baseHp = baseHp;
		this.baseExp = baseExp;
		this.baseAtk = baseAtk;
		this.crrHp = this.baseHp;
		this.maxHp = this.baseHp;
		this.maxAtk = this.baseAtk;
		this.lootId = lootId;
	}
	
	public Enemy()
	{		
	}

	public int getLootId()
	{
		return lootId;
	}
	
	public void setBaseExp(int modifier) 
	{
		this.baseExp += modifier;
	}

	public int getBaseHp() 
	{
		return baseHp;
	}

	public int getBaseExp() 
	{
		return baseExp;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public int getBatk() 
	{
		return baseAtk;
	}

	public void setBatk(int atk) 
	{
		this.baseAtk = atk;
	}

	public int getMaxAtk() 
	{
		return maxAtk;
	}

	public void setMaxAtk(int modifier) 
	{
		this.maxAtk = this.maxAtk + modifier;
	}

	public int getMaxHp() 
	{
		return maxHp;
	}

	public void setMaxHp(int modifier) 
	{
		this.maxHp = this.baseHp + modifier;
		this.crrHp = this.maxHp;
	}
	
	public int getCrrHp() 
	{
		return crrHp;
	}

	public void setCrrHp(int modifier) 
	{
		this.crrHp = this.crrHp - modifier;
	}

	@Override
	public String toString()
	{
		System.out.println("Name: " + this.getName()
				+ "\nHealth Points: " + baseHp 
				+ "\nDescription: " + description
				+ "\nAttack: " + maxAtk);
		return "1";
	}

}
