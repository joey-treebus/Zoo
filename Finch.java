import java.util.*;

public class Finch extends Bird
{
	boolean smallBeak = true;

	public Finch(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean canFly, boolean hasFeathers, boolean smallBeak)
	{
		super(name,type,conservationStatus,gender,babies,age,canFly,hasFeathers);
		this.smallBeak = smallBeak;
		this.type = "Finch";
		this.conservationStatus = "safe";
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

	public void setBeak()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Does "+name+" have a small beak?(true/false)");
		boolean smallBeak = Boolean.parseBoolean(s.nextLine());
		this.smallBeak = smallBeak;
	}

	@Override
	public void print()
	{
		System.out.println("Fly: "+getFly()+"\nFeathers: "+getFeathers()+"\nSmall Beak: "+getBeak());
	}

}
