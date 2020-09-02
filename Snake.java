import java.util.*;

public class Snake extends Reptile
{
	boolean poisonous = true;

	public Snake(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean hasLegs, boolean poisonous)
	{
		super(name,type,conservationStatus,gender,babies,age,hasLegs);
		this.poisonous = true;
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
	public void setPoison()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Is "+name+" poisonous?(true/false)");
		boolean poison = Boolean.parseBoolean(s.nextLine());
		this.poisonous = poison;
	}

	@Override
	public void print()
	{
		System.out.println("Legs: "+getLegs()+"\nPoisonous: "+getPoison());
	}
}
