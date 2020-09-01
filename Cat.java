
public class Cat extends Mammal
{
	boolean hasSpots = true;

	public Cat(String name, String conservationStatus,String diet, String gender, boolean babies, int age, boolean liveInTree, boolean hasSpots)
	{
		super(name,conservationStatus,diet,gender,babies,age,liveInTree);
		this.hasSpots = hasSpots;
		this.type = "cat";
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

	public void setSpots(boolean hasSpots)
	{
		this.hasSpots = hasSpots;
	}
}
