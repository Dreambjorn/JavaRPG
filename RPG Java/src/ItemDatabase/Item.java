package ItemDatabase;

public class Item 
{
	public String id;
	public String title;
	public String description;
	public int atk;

	public Item(String id, String title, String description, int atk) 
	{
		this.id = id;
		this.title = title;
		this.description = description;
		this.atk = atk;
	}

	public Item() 
	{
	}
	
	public String getId() 
	{
		return id;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public String getDesc() 
	{
		return description;
	}
	
	public int getAtk() 
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
