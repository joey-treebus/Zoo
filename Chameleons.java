package zoo.animals;
import zoo.animals.Reptile;

public class Chameleon expends Reptile
{
	boolean color;

	public Chameleon(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean hasLegs, boolean color)
	{
		super(name,conservationStatus,diet,gender,babies,age,hasLegs);
		this.color = color;
		this.type = "chameleon";
	}

	public Chameleon(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	public boolean getColor()
	{
		return color;
	}

	public void setColor(boolean color)
	{
		this.color = color;
	}

}
