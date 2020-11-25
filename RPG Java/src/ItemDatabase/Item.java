package ItemDatabase;

public class Item {
	public int id;
	public String title;
	public String description;
	public int atk;

	public Item() {
	}

	public Item(int id, String title, String description, int atk) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.atk = atk;
	}

	public int getId() {
		return id;
	}

}
