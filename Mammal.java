import zoo.animals.Animal;

public class Mammal extends Animal
{
	boolean liveInTree = true;

	public Mammal(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean liveInTree)
	{
			super(name, conservationStatus, diet, gender, babies, age);
			this.liveInTree = liveInTree;
			this.type = "mammal";
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
}
	
