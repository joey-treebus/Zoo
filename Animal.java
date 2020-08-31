public class Animal
{
	String name;
	String conservationStatus = "N/A";
	String diet = "N/A";
	String gender = "N/A";
	boolean babies = false;
	int age = 0;
	String type;

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

	public String setConservationStatus(String conservationStatus)
	{
		this.conservationStatus = conservationStatus;
	}
	public void getConservationStatus()
	{
		return conservationStatus;
	}

	public String setDiet(String diet)
	{
		this.diet = diet;
	}
	public void getDiet()
	{
		return diet;
	}

	public String setGender(String gender)
	{
		this.gender = gender;
	}
	public void getGender()
	{
		return gender;
	}

	public boolean setBabies(boolean babies)
	{
		this.babies = babies;
	}
	public void getBabies()
	{
		return babies;
	}

	public int setAge(int age)
	{
		this.age = age;
	}
	public void getAge()
	{
		return age;
	}

	public String verbose()
	{
		String verbose = "Name: "+this.name+"\nAnimal: "+this.animalType+"\n";
		return verbose;
	}

	public String info()	//change the name of this
	{
		//print all info out
		return info;
	}





