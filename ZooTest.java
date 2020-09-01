import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


class ZooTest {

	//properties
	Scanner myObj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		ArrayList<Animal> animalList = new ArrayList<Animal>();

		
		animalList = setupAnimals();
		
		printVerboseList(animalList);

		String input = "";
		while (!input.toLowerCase().equals("exit"))
		{
	
			printSummaryList(animalList);
			Scanner sc = new Scanner(System.in);
			System.out.println("Options: \n \n Add animal(add) \n Delete animal (delete) \n Display animal (display)\n");
			input = sc.nextLine();
			System.out.println("What type of animal would you like to "+input+"? ");
			String type = sc.nextLine();
			System.out.println("What is the name of the "+type+"? ");
			String name = sc.nextLine();

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
		addAnimal("monkey","Maggie",animals);
		addAnimal("cat","Cathy",animals);
		addAnimal("chameleon","Carl",animals);
		addAnimal("snake","Susan",animals);
		addAnimal("finch","Felipe",animals);
		addAnimal("penguin","Paul",animals);

		
		System.out.println("added");
		return animals;
	}
		
	public static void printSummaryList(ArrayList<Animal> animals)
	{
		int monkeys = 0;
		int cats = 0;
		int chameleons = 0;
		int snakes = 0;
		int finches = 0;
		int penguins = 0;
		int total = 0;

		for(int i=0; i<animals.size(); i++)
		{
			if(animals.get(i) instanceof Monkey){
				monkeys++;
				total++;
			}
			if(animals.get(i) instanceof Cat){
				cats++;
				total++;
			}
			if(animals.get(i) instanceof Chameleon){
				chameleons++;
				total++;
			}
			if(animals.get(i) instanceof Snake){
				snakes++;
				total++;
			}
			if(animals.get(i) instanceof Finch){
				finches++;
				total++;
			}
			if(animals.get(i) instanceof Penguin){
				penguins++;
				total++;
			}
		}

		System.out.println("\nSummary:");
		System.out.println("There are " +total+ " animals in the zoo.");
		System.out.println(monkeys+" Monkeys");
		System.out.println(cats+" Cats");
		System.out.println(chameleons+" Chameleons");
		System.out.println(snakes+" Snakes");
		System.out.println(finches+" Finches");
		System.out.println(penguins+" Penguins");
		System.out.println("");
			
	}

	public static void printVerboseList(ArrayList<Animal> animals)
	{
		System.out.println("\nVerbose List:");
		for(int i=0;i<animals.size();i++)
		{
			System.out.println((i+1)+". "+animals.get(i).verbose());
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
		boolean exists = false;
		for(int i=0; i<list.size(); i++)
		{
			if((name.toLowerCase().equals(list.get(i).getName().toLowerCase())) && (type.toLowerCase().equals(list.get(i).getType().toLowerCase())))
			{
				System.out.println(list.get(i).info());
				exists = true;
			}
		}
		if(!exists)
			System.out.println("This animal does not exist in the zoo.");
	}
}
	
