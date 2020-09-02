import java.util.*;
public class Chameleon extends Reptile
{
	boolean color = false;

	public Chameleon(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean hasLegs, boolean color)
	{
		super(name,type,conservationStatus,gender,babies,age,hasLegs);
		this.color = color;
		this.type = "Chameleon";
		this.conservationStatus = "safe";
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

	public void setColor()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Does "+name+" change color?(true/false)");
		boolean color = Boolean.parseBoolean(s.nextLine());
		this.color = color;
	}

	@Override
	public void print()
	{
		System.out.println("Legs: "+getLegs()+"\nColor: "+getColor());
	}

}
