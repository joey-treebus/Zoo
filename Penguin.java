
public class Penguin extends Bird
{
	boolean arctic;

	public  Penguin(String name, String conservationStatus, String diet, String gender, boolean babies, int age, boolean canFly, boolean hasFeathers,boolean arctic)
	{
		super(name,conservationStatus,diet,gender,babies,age,canFly,hasFeathers);
		this.arctic = arctic;
		this.type = "penguin";
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
	public void setArctic(boolean arctic)
	{
		this.arctic = arctic;
	}
}
