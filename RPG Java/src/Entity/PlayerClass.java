package Entity;

public class PlayerClass extends PC
{
	private int baseHp;
	private int maxHp;
	private int crrHp;
	private int baseAtk;
	private int maxAtk;
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
				break;
			case "A":
				this.baseHp = 15;
				this.baseAtk = 5;
				break;
			case "M":
				this.baseHp = 10;
				this.baseAtk = 7;
				break;	
		}	
		this.crrHp = this.baseHp;
		this.maxHp = this.baseHp;
		this.maxAtk = this.baseAtk;
	}
	
	public void setRole(String role) 
	{
		this.role = role;
	}

	public int getBaseHp() 
	{
		return baseHp;
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
	
	public void hpToMax()
	{
		this.crrHp = this.maxHp;
	}

	public int getBaseAtk() 
	{
		return baseAtk;
	}

	public int getMaxAtk() 
	{
		return maxAtk;
	}

	public void setMaxAtk(int modifier) 
	{
		this.maxAtk = this.maxAtk + modifier;
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
				roleString = "Archer";
				break;
			case "M":
				roleString = "Mage";
				break;	
		}	
		
		System.out.println("Name: " + this.getName()
				+ "\nHealth Points: " + baseHp
				+ "\nClass: " + roleString
				+ "\nAttack: " + maxAtk);
		return "1";
	}
}
