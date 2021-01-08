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
	private int lvl = 1;
	
	public Enemy(String name, int baseAtk, String description, 
			int eqItem, int baseHp, int baseExp, int lootId)
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

	public void scale() 
	{
		this.lvl += 1;
		this.setBatk();
		this.setBaseHp();
		this.setScaleExp();
		this.maxAtk = this.baseAtk;
	}
	
	public int getLootId()
	{
		return lootId;
	}
	
	public void setBaseExp(int modifier) 
	{
		this.baseExp += modifier;
	}

	public void setScaleExp()
	{
		this.baseExp = (int)(this.lvl * this.baseExp / 1.5);
	}
	
	public int getBaseHp() 
	{
		return baseHp;
	}

	public void setBaseHp()
	{
		this.baseHp = (int)(this.lvl * this.baseHp / 1.5);
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

	public void setBatk() 
	{
		this.baseAtk = (int)(this.lvl * this.baseAtk / 1.5);
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
	
	public void setMaxHp() 
	{
		this.maxHp = this.baseHp;
		this.crrHp = this.maxHp;
	}
	
	public void qtMaxHp(int hp)
	{
		this.maxHp = hp;
	}
	
	public int getCrrHp() 
	{
		return crrHp;
	}

	public void setCrrHp(int modifier) 
	{
		this.crrHp = this.crrHp - modifier;
	}

	public void setToZero()
	{
		this.crrHp = 0;
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
