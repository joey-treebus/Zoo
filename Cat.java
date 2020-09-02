import java.util.*;

public class Cat extends Mammal
{
	boolean hasSpots = true;

	public Cat(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean liveInTree, boolean hasSpots)
	{
		super(name,type,conservationStatus,gender,babies,age,liveInTree);
		this.hasSpots = hasSpots;
		this.conservationStatus = "endangered";
		this.type = "Cat";
	}

	public Cat(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	public boolean getSpots()
	{
		return hasSpots;
	}

	public void setSpots()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Does "+this.name+" have spots?(true/false)");
		boolean hasSpots = Boolean.parseBoolean(s.nextLine());
		this.hasSpots = hasSpots;
	}

	@Override
	public void print()
	{
		System.out.println("Lives in a Tree: "+getLiveInTree()+"\nSpots: "+getSpots());
	}
}
