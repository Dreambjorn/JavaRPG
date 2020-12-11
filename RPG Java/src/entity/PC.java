package entity;

public class PC extends Character 
{
	//private int baseHp;
	private int[] reqExp = new int[] {10, 15, 20, 25};
	private int[] inventory = new int[50];
	private static int count = 0;
	private int crrExp;
	
	public PC(String name, 
			int eqItem)
	{
		super(name, eqItem);
	}
	
	public PC()
	{		
	}
	
	public void setInventory(int itemId)
	{
		inventory[count] = itemId;
		count ++;
	}
	
	public int getInventory(int itemId)
	{
		return inventory[itemId];
	}
	
	public int getItemCount()
	{
		return count;
	}
	
	public int getCrrExp() 
	{
		return crrExp;
	}

	public int getReqExp(int level) 
	{
		return reqExp[level];
	}
	
	public void resetExp()
	{
		this.crrExp = 0;
	}
		
	public void setCrrExp(int expGain) 
	{
		this.crrExp += expGain;
	}
}
