
public class Reptile extends Animal
{
	boolean hasLegs;

	public Reptile(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean hasLegs)
	{
		super(name,conservationStatus,diet,gender,babies,age);
		this.hasLegs = hasLegs;
		this.type = "reptile";
	}

	public Reptile(String name, String type)
	{
		super(name,type);
	}

	public boolean getLets()
	{
		return hasLegs;
	}
	public void setLegs(boolean hasLegs)
	{
		this.hasLegs = hasLegs;
	}

}
