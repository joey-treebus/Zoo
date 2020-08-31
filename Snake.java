package zoo.animals;
import zoo.animals.Reptile;

public class Snake extends Reptile
{
	boolean poisonous;

	public Snake(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean hasLegs, boolean poisonous)
	{
		super(name,conservationStatus,diet,gender,babies,age,hasLegs,poisonous);
		this.poisonous = poisonous;
		this.type = "snake";
	}

	public Snake(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	public boolean getPoison()
	{
		return poisonous;
	}
	public void setPoison(boolean poisonous)
	{
		this.poisonous = poisonous;
	}
}
