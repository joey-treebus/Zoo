
public class Bird extends Animal
{
	boolean canFly = true;
	boolean hasFeathers = true;

	public Bird(String name, String type, String conservationStatus, String gender, boolean babies, int age,boolean canFly, boolean hasFeathers)
	{
		super(name,type,conservationStatus,gender,babies,age);
		this.canFly = canFly;
		this.hasFeathers = hasFeathers;
		this.type = "Bird";
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

	@Override
	public void print()
	{
		System.out.println("Bird");
	}
}

