package regionsDatabase;

public class Region 
{
	private String name;
	@SuppressWarnings("unused")
	private char[] enemyId = new char[5];
	private String description;
	private int reqLvl;
	//private char[] questId = new char[5]; -> each region has its quests
	
	public Region(String name, String description, int reqLvl)
	{
		this.name = name;
		this.description = description;
		this.reqLvl = reqLvl;
	}
	
	public Region(char[] enemyId)
	{
		this.enemyId = enemyId;
	}

	public String getName() {
		return name;
	}

	public void setEnemyId(char[] enemyId) 
	{
		this.enemyId = enemyId;
	}

	public String getDescription() {
		return description;
	}

	public int getReqLvl() {
		return reqLvl;
	}
	
	@Override
	public String toString()
	{
		System.out.println("Name: " + this.getName()
				+ "\nDescription: " + this.getDescription()
				+ "\nRequired Level: " + this.getReqLvl());
		return "1";
	}
}
