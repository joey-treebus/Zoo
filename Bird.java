package zoo.animals;
import zoo.animals.Animal;

public class Bird extends Animal
{
	boolean canFly = true;
	boolean hasFeathers = true;

	public Bird(String name, String conservationStatus, String diet, String gender, boolean babies, int age)
	{
		super(name,conservationStatus,diet,gender,babies,age);
		this.canFly = canFly;
		this.hasFeathers = hasFeathers;
		this.type = "bird";
	}

	public Bird(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	public boolean getFly()
	{
		return canFly;
	}
	public void setFly(boolean canFly)
	{
		this.canFly = canFly;
	}

	public boolean getFeathers()
	{
		return hasFeathers;
	}
	public void setFeathers(boolean hasFeathers)
	{
		this.hasFeathers = hasFeathers;
	}
}

