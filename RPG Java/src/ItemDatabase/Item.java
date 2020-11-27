package ItemDatabase;

public class Item 
{
	private String title;
	private String description;
	private int atk;
	private String role;

	public Item(String title, int atk, String description, String role) 
	{
		this.title = title;
		this.description = description;
		this.atk = atk;
		this.role = role;
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
	
	public int getAtk() 
	{
		return atk;
	}
	
	public String getRole() 
	{
		return role;
	}

	@Override
	public String toString()
	{
		System.out.println("Name: " + title 
				+ "\nAttack: " + atk + "\nDescription: " 
				+ description);
		return "1";
	}

}
