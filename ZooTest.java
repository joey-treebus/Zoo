import java.util.Scanner;
import java.util.ArrayList;



class ZooTest {

	//properties
	

	public static void main(String[] args){

		Scanner myObj = new Scanner(System.it);
		String input = myObj.nextline();

		printVerboseList();

		while (input != "exit"){
	
			printSummaryList();
			System.out.println("Options: \n \n Add animal(add) \n Delete animal (delete) \n Display animal (display)");
			String input = myObj.nextline();

			switch (input){

				case "add":
					addAnimal();
					break;

				case "delete":
					deleteAnimal();
					break;

				case "display":
					displayAnimal();
					break;

				default:
					System.exit(1);
			}
		}
					
			
			
	}
		
	printSummaryList(Animal [] animals){

		System.out.println("Summary: \n There are " + animals.size() + " animals in the zoo.") 
	}

	printVerboseList(Animal [] animals){
	}

	Animal [] checkAnimalInput(String input, Animal [] animals){
		
		System.out.println("Please enter an animal: ");

		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
	
		for (int i = 1; i <= animals.size(); i++){
			if (input != animals[i]){
				System.out.println("Error. Animal is not in zoo.");
			}
		}
	}

	Animal [] addAnimal(Animal a, Animal [] animals){
	}

	Animal [] deleteAnimal(String name, Animal [] animals){
	}

	Animal [] displayAnimal(){
	}
}
	
