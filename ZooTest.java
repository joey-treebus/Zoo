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
			System.out.println("Options: \n Add animal(add) \n Delete animal (delete) \n Display animal (display) \n Display All Animals (verbose)\n Leave Zoo (exit)");
			input = sc.nextLine();
			if(input.toLowerCase().equals("exit"))
					break;
			if(input.toLowerCase().equals("verbose"))
			{
				printVerboseList(animalList);
				continue;
			}
			if(input.toLowerCase().equals("add") || input.toLowerCase().equals("delete") || input.toLowerCase().equals("display"))
			{
				
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
			else
				System.out.println("Please choose a valid action. Try again");
		}
		System.out.println("Thanks for visiting the Zoo!");		
	}

	public static ArrayList<Animal> setupAnimals() 
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		//hard coded way to set up the zoo initially
		animals.add(new Monkey("Maggie","Monkey","safe","female",true,6,true,true));
		animals.add(new Cat("Cathy","Cat","endangered","female",false,8,false,true));
		animals.add(new Chameleon("Carl","Chameleon","safe","male",false,3,true,true));
		animals.add(new Snake("Susan","Snake","safe","female",true,12,false,true));
		animals.add(new Finch("Felipe","Finch","safe","male",false,1,true,true,true));
		animals.add(new Penguin("Paul","Penguin","endangered","male",false,6,false,false,true));

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
	}

	public static void printVerboseList(ArrayList<Animal> animals)
	{
		System.out.println("\nVerbose List:");
		String a = "Animal";
		String n = "Name";
		System.out.printf("   %-10s %-10s %n",a,n);
		for(int i=0;i<animals.size();i++)
		{
			System.out.printf((i+1)+". %-10s %-10s %n",animals.get(i).getType(),animals.get(i).getName());
		}
	}

	public static ArrayList<Animal> addAnimal(String type, String name, ArrayList<Animal> list)
	{
		Animal a = new Animal();
		Scanner sc = new Scanner(System.in);
		
		if(type.toLowerCase().equals("monkey"))
		{
			a = new Monkey(name,type);
			((Mammal)a).setLiveInTree(true);
			((Monkey)a).setOpposableThumbs();
		}
		else if(type.toLowerCase().equals("cat"))
		{
			a = new Cat(name,type);
			((Mammal)a).setLiveInTree(false);
			((Cat)a).setSpots();
		}
		else if(type.toLowerCase().equals("chameleon"))
		{
			a = new Chameleon(name,type);
			((Reptile)a).setLegs(true);
			((Chameleon)a).setColor();
		}
		else if(type.toLowerCase().equals("snake"))
		{
			a = new Snake(name,type);
			((Reptile)a).setLegs(false);
			((Snake)a).setPoison();
		}
		else if(type.toLowerCase().equals("finch"))
		{
			a = new Finch(name,type);
			((Bird)a).setFly(true);
			((Bird)a).setFeathers(true);
			((Finch)a).setBeak();
		}
		else if(type.toLowerCase().equals("penguin"))
		{
			a = new Penguin(name,type);
			((Bird)a).setFly(false);
			((Bird)a).setFeathers(false);
			((Penguin)a).setArctic();
		}
		else
		{
			System.out.println("We do not accept the "+type+" animal in the zoo");
			return list;
		}
	
		//Setting up the general characteristics
		System.out.println("Is "+name+" male or female?");
		String g = sc.nextLine();
		if(g.toLowerCase().equals("female"))
		{
			a.setGender("female");
			System.out.println("Does "+name+" have any babies?(yes/no)");
			String b = sc.nextLine();
			if(b.toLowerCase().equals("yes"))
					a.setBabies(true);
			else
				a.setBabies(false);
		}
		else if(g.toLowerCase().equals("male"))
		{
				a.setGender("male");
				a.setBabies(false);
		}
		else
			a.setGender("unknown");

		System.out.println("What is the age of "+name+" the "+type);
		int AGE = Integer.parseInt(sc.nextLine());
		a.setAge(AGE);

		
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
				return list;
			}
		}
		System.out.println(name+" the "+type+" does not exist in the zoo");
		return list;

	}

	public static void displayAnimal(String type, String name, ArrayList<Animal> list)
	{
		boolean exists = false;
		Animal a = new Animal();
		for(int i=0; i<list.size(); i++)
		{
			if((name.toLowerCase().equals(list.get(i).getName().toLowerCase())) && (type.toLowerCase().equals(list.get(i).getType().toLowerCase())))
			{
				System.out.println("\nName: "+list.get(i).getName());
				System.out.println("Animal: "+list.get(i).getType());
				System.out.println("Conservation Status: "+list.get(i).getConservationStatus());
				System.out.println("Gender: "+list.get(i).getGender());
				System.out.println("Babies: "+list.get(i).getBabies());
				System.out.println("Age: "+list.get(i).getAge());
				list.get(i).print();
				exists = true;
			}
		}
		if(!exists)
			System.out.println("This animal does not exist in the zoo.");
	}
}
	
