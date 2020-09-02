
public class Monkey extends Mammal
{
	boolean opposableThumbs = true;
	
	public Monkey(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean livesInTree, boolean opposableThumbs)
	{
		super(name,conservationStatus,diet,gender,babies,age,livesInTree);
		this.conservationStatus = "safe";
		this.opposableThumbs = true;
		this.type = "monkey";
	}

	public Monkey(String name, String type)
	{
		super(name,type);
	}

	public boolean getOpposableThumbs()
	{
		return opposableThumbs;
	}
	public void setOpposableThumbs(boolean opposableThumbs)
	{
		this.opposableThumbs = opposableThumbs;
	}
}
