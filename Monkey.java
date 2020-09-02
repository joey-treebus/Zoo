import java.util.*;

public class Monkey extends Mammal
{
	boolean opposableThumbs = true;
	
	public Monkey(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean livesInTree, boolean opposableThumbs)
	{
		super(name,type,conservationStatus,gender,babies,age,livesInTree);
		this.conservationStatus = "safe";
		this.opposableThumbs = true;
		this.type = "Monkey";
	}

	public Monkey(String name, String type)
	{
		super(name,type);
	}

	public boolean getOpposableThumbs()
	{
		return opposableThumbs;
	}
	public void setOpposableThumbs()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Does "+this.name+" have opposable thumbs? (true/false)");
		boolean opposableThumbs = Boolean.parseBoolean(s.nextLine());
		this.opposableThumbs = opposableThumbs;
	}
	
	@Override
	public void print()
	{
		System.out.println("Lives in Tree: "+getLiveInTree()+"\nOpposable Thumbs: "+getOpposableThumbs());
	}
}
