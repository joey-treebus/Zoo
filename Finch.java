import zoo.animals;
import zoo.animals.Bird;

public class Finch extends Bird
{
	boolean smallBeak = true;

	public Finch(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean canFly, boolean hasFeathers, boolean smallBeak)
	{
		super(name,conservationStatus,diet,gender,babies,age,canFly,hasFeathers);
		this.smallBeak = smallBeak;
		this.type = "finch";
	}

	public Finch(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	public boolean getBeak()
	{
		return smallBeak;
	}

	public void setBeak(boolean smallBeak)
	{
		this.smallBeak = smallBeak;
	}

}
