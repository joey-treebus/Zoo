
public class Animal
{
	String name;
	String conservationStatus = "N/A";
	String diet = "N/A";
	String gender = "N/A";
	boolean babies = false;
	int age = 0;
	String type;
	//String info = "Name: "+this.name+"\nAnimal: "+this.type+"\nConservation Status: "+this.conservationStatus+"\nGender: "+this.gender+"\nBabies: "+this.babies+"\nAge: "+this.age;

	public Animal() {}

	public Animal(String name, String conservationStatus, String diet, String gender, boolean babies, int age)
	{
		this.name = name;
		this.conservationStatus = conservationStatus;
		this.diet = diet;
		this.gender = gender;
		this.babies = babies;
		this.age = age;
	}

	public Animal(String name, String animalType)
	{
		this.name = name;
		this.type = animalType;
	}

//Getters and Setters
	//make these final
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public void setConservationStatus(String conservationStatus)
	{
		this.conservationStatus = conservationStatus;
	}
	public String getConservationStatus()
	{
		return conservationStatus;
	}

	public void setDiet(String diet)
	{
		this.diet = diet;
	}
	public String getDiet()
	{
		return diet;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return gender;
	}

	public void setBabies(boolean babies)
	{
		this.babies = babies;
	}
	public boolean getBabies()
	{
		return babies;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}

	public String verbose()
	{
		String verbose = (this.name+" "+this.type);
		return verbose;
	}

	/*public String info()
	{
		return info;
	}*/
	public String getType()
	{
		return type;
	}
}




