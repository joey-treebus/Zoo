import java.util.*;

public class Penguin extends Bird
{
	boolean arctic;

	public  Penguin(String name, String type, String conservationStatus, String gender, boolean babies, int age, boolean canFly, boolean hasFeathers,boolean arctic)
	{
		super(name,type,conservationStatus,gender,babies,age,canFly,hasFeathers);
		this.arctic = arctic;
		this.type = "Penguin";
		this.conservationStatus = "endangered";
	}

	public Penguin(String name, String type)
	{
		super(name,type);
	}

	//getters and setters
	
	public boolean getArctic()
	{
		return arctic;
	}
	public void setArctic()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Is "+name+" an arctic penguin?(true/false)");
		boolean arctic = Boolean.parseBoolean(s.nextLine());
		this.arctic = arctic;
	}

	@Override
	public void print()
	{
		System.out.println("Fly: "+getFly()+"\nFeathers: "+getFeathers()+"\nArctic: "+getArctic());
	}
}
