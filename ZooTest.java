import java.util.Scanner;
import java.util.ArrayList;



class ZooTest {

	//properties
	Scanner myObj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ArrayList<Animal> animalList = new ArrayList<Animal>();

		try
		{
			animalList = setupAnimals();
		}catch(Exception ex){
			System.out.println("Exception Caught");
		}
		
		printVerboseList(animalList);

		String input = "";
		while (!input.toLowerCase().equals("exit"))
		{
	
			printSummaryList(animalList);
			System.out.println("Options: \n \n Add animal(add) \n Delete animal (delete) \n Display animal (display)");
			String input = myObj.nextline();
			System.out.println("What type of animal would you like to "+input+"?");
			String type = myObj.nextline();
			System.out.println("What is the name of the "+type+"?");
			String name = myObj.nextline();

			switch (input){
				case "add":
					animalList = addAnimal(type,name,animalList);
					break;
				case "delete":
					animalList = deleteAnimal(type,name,animalList);
					break;
				case "display":
					displayAnimal(type,name,animalList);
					break;
				default:
					System.exit(1);
			}
		}
		System.out.println("Thanks for visiting the Zoo!");		
	}

	public static ArrayList<Animal> setupAnimals() 
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		addAnimal("Maggie","monkey",animals);
		addAnimal("Cathy","cat",animals);
		addAnimal("Carl","chameleon",animals);
		addAnimal("Susan","snake",animals);
		addAnimal("Felipe","finch",animals);
		addAnimal("Paul","Penguin",animals);
		
		return animals;
	}
		
	public static void printSummaryList(ArrayList<Animal> animals)
	{

		System.out.println("Summary: \n There are " + animals.size() + " animals in the zoo.") 
			//count all animals and print them out
	}

	public static void printVerboseList(ArrayList<Animal> animals)
	{
		System.out.println("\nVerbose List:");
		for(int i=0;i<animals.size();i++)
		{
			//print out name and species
		}
	}

	/*Animal [] checkAnimalInput(String input, Animal [] animals){
		
		System.out.println("Please enter an animal: ");

		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
	
		for (int i = 1; i <= animals.size(); i++){
			if (input != animals[i]){
				System.out.println("Error. Animal is not in zoo.");
			}
		}
	}*/

	public static ArrayList<Animal> addAnimal(String type, String name, ArrayList<Animal> list)
	{
		Animal a = new Animal();
		
		if(type.equals("monkey"))
			a = new Monkey(name,type);
		else if(type.equals("cat"))
			a = new Cat(name,type);
		else if(type.equals("chameleon"))
			a = new Chameleon(name,type);
		else if(type.equals("snake"))
			a = new Snake(name,type);
		else if(type.equals("finch"))
			a = new Finch(name,type);
		else if(type.equals("penguin"))
			a = new Penguin(name,type);
		list.add(a);
		return list;
	}

	public static ArrayList<Animal> deleteAnimal(String type, String name, ArrayList<Animal> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			if((name.toLowerCase().equals(list.get(i).getName().toLowerCase())) && (type.toLowerCase().equals(list.get(i).getType().toLowerCase())))
			{
				list.remove(i);
				System.out.println(name+" the "+type+" has been removed.");
			}
		}
		return list;

	}

	public static void displayAnimal(String type, String name, ArrayList<Animal> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			if((name.toLowerCase().equals(list.get(i).getName().toLowerCase())) && (type.toLowerCase().equals(list.get(i).getType().toLowerCase())))
				System.put.println(list.get(i).moreInfo());
		}
	}
}
	
