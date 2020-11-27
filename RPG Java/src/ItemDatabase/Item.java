package ItemDatabase;

public class Item 
{
	public String title;
	public String description;
	public String atk;

	public Item(String title, String atk, String description) 
	{
		this.title = title;
		this.description = description;
		this.atk = atk;
	}

	public Item() 
	{
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getDesc() 
	{
		return description;
	}
	
	public String getAtk() 
	{
		return atk;
	}
	
	@Override
	public String toString()
	{
		System.out.println("Name: " + title + "\nAttack: " + atk + "\nDescription: " + description);
		return "1";
	}

}
