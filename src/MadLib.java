import java.util.Scanner;

public class MadLib
{

	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a verb ending in 'ING':  ");
		String verb = keyboard.nextLine();
		System.out.print("Please enter a proper he or she:   "); 
		String heshe = keyboard.nextLine();
		System.out.print("Please enter a verb ending in 'ED':   ");
		String verb1 = keyboard.nextLine();
		System.out.print("Please enter an emotion:  ");
		String emotion = keyboard.nextLine();
		System.out.print("Please enter a proper noun:    ");
		String propernoun1 = keyboard.nextLine();
		System.out.print("Please enter a place:   ");
		String place = keyboard.nextLine();
		System.out.print("Please enter a food:     ");
		String food = keyboard.nextLine();
		System.out.print("Please enter a play/musical:   ");
		String playmusical = keyboard.nextLine();
		System.out.print("Please enter a verb:    ");
		String verb2 = keyboard.nextLine();
		System.out.print("Please enter a clothing item:    ");
		String clothingitem = keyboard.nextLine();
	
		
		System.out.print("I was" + verb + "in the car when " + heshe + verb1 + " at me " + "I was so" + emotion + "to see that it was" + propernoun1
		+ "This year we are going to" + place + "When we get there we will eat a dozen"
		+ food + "I want to go see" + playmusical + "and" + verb2 + "all day I will wear"
		+ clothingitem );
		}
}
