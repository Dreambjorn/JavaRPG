package Entity;

public class PC extends Character 
{
	//private int baseHp;
	private int crrExp;
	
	public PC(String name, 
			int eqItem)
	{
		super(name, eqItem);
	}
	
	public PC()
	{		
	}
	
	public int getCrrExp() 
	{
		return crrExp;
	}

	public void setCrrExp(int crrExp) 
	{
		this.crrExp = crrExp;
	}
}
