
public class Mammal extends Animal
{
	boolean liveInTree = true;

	public Mammal(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean liveInTree)
	{
			super(name, type, conservationStatus, gender, babies, age);
			this.liveInTree = liveInTree;
			this.type = "Mammal";
	}

	public Mammal(String name, String animalType)
	{
		super(name,animalType);
	}

	//getters and setters
	public boolean getLiveInTree()
	{
		return liveInTree;
	}
	public void setLiveInTree(boolean liveInTree)
	{
		this.liveInTree = liveInTree;
	}

	@Override
	public void print()
	{
		System.out.println("Mammal");
	}
}
	
