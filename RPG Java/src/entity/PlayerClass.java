package entity;

public class PlayerClass extends PC
{
	private int baseHp;
	private int maxHp;
	private int crrHp;
	private int baseAtk;
	private int maxAtk;
	private int crrLevel;
	private String role;
	
	public PlayerClass(String name, 
			int eqItem, String role)
	{
		super(name, eqItem);
		
		this.role = role;
		switch(role)
		{
			case "W":
				this.baseHp = 20;
				this.baseAtk = 3;
				this.crrLevel = 1;
				break;
			case "R":
				this.baseHp = 15;
				this.baseAtk = 5;
				this.crrLevel = 1;
				break;
			case "M":
				this.baseHp = 10;
				this.baseAtk = 7;
				this.crrLevel = 1;
				break;	
		}	
		this.crrHp = this.baseHp;
		this.maxHp = this.baseHp;
		this.maxAtk = this.baseAtk;
		this.setInventory(eqItem);
	}
	
	public PlayerClass()
	{
	}
	
	public void preInit()
	{
		setName();
	}
	
	public void setRole(String role) 
	{
		this.role = role;
	}

	public int getBaseHp() 
	{
		return baseHp;
	}

	public void setBaseHp()
	{
		this.baseHp = (int)(this.getCrrLevel() * this.baseHp / 1.5);
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

	public int getCrrHp() 
	{
		return crrHp;
	}

	public void setCrrHp(int modifier) 
	{
		this.crrHp = this.crrHp - modifier;
	}
	
	public void resetHp()
	{
		this.crrHp = this.maxHp;
	}
	
	public void setToZero()
	{
		this.crrHp = 0;
	}
	
	public int getBaseAtk() 
	{
		return baseAtk;
	}

	public void setBaseAtk()
	{
		this.baseAtk = (int)(this.getCrrLevel() * this.baseAtk / 1.5);
	}
	
	public int getMaxAtk() 
	{
		return maxAtk;
	}

	public void setMaxAtk(int modifier) 
	{
		this.maxAtk = this.maxAtk + modifier;
	}
	
	public int getCrrLevel() 
	{
		return crrLevel;
	}

	public boolean setCrrLevel() 
	{
		if(this.getCrrExp() >= this.getReqExp(this.getCrrLevel() - 1))
		{
			this.crrLevel += 1;
			this.setBaseAtk();
			this.setBaseHp();
			
			int aux = this.getReqExp(this.getCrrLevel()) - this.getCrrExp();
			if(aux < 0)
				aux *= -1;
			
			this.resetExp();
			this.setCrrExp(aux);
			
			return true;
		}
		return false;
	}

	public String getRole()
	{
		return role;
	}
	
	@Override
	public String toString()
	{
		String roleString = "";
		switch(role)
		{
			case "W":
				roleString = "Warrior";
				break;
			case "A":
				roleString = "Ranger";
				break;
			case "M":
				roleString = "Mage";
				break;	
		}	
		
		System.out.println("Name: " + this.getName()
				+ "\nHealth Points: " + this.getMaxHp()
				+ "\nClass: " + roleString
				+ "\nLevel: " + this.getCrrLevel()
				+ "\nAttack: " + this.getMaxAtk());
		return "1";
	}
}
