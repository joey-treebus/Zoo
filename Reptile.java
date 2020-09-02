
public class Reptile extends Animal
{
	boolean hasLegs;

	public Reptile(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean hasLegs)
	{
		super(name,type,conservationStatus,gender,babies,age);
		this.hasLegs = hasLegs;
		this.type = "Reptile";
	}

	public Reptile(String name, String type)
	{
		super(name,type);
	}

	public boolean getLegs()
	{
		return hasLegs;
	}
	public void setLegs(boolean hasLegs)
	{
		this.hasLegs = hasLegs;
	}
	
	@Override
	public void print()
	{
		System.out.println("Reptile");
	}

}
