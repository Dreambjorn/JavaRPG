package Entity;

public class Enemy extends Character
{
	private int baseHp;
	private int baseExp;
	private int Exp;
	private String description;
	private int baseAtk;
	private int maxAtk;
	private int maxHp;
	private int crrHp;
	
	public Enemy(String name, int baseAtk, String description, 
			int eqItem, int baseHp, int baseExp)
	{
		super(name, eqItem);
		this.description = description;
		this.baseHp = baseHp;
		this.baseExp = baseExp;
		this.baseAtk = baseAtk;
		this.crrHp = this.baseHp;
		this.maxHp = this.baseHp;
		this.maxAtk = this.baseAtk;
		this.Exp = this.baseExp;
	}
	
	public Enemy()
	{		
	}
	
	public int getExp() 
	{
		return Exp;
	}

	public void setExp(int modifier) 
	{
		this.Exp += modifier;
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
				+ "\nDescription: " + description);
		return "1";
	}

}
