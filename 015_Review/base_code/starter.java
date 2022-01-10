import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name edgy traveller senpai?");
		String yurname = sc.nextLine();
		System.out.println("What is your title fs senpai");
		String yurtitlefs = sc.nextLine();
		String baka1 = ("hi");

		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? Make sure it's capital");
		baka1 = sc.nextLine();
	
		while ( !(baka1.equals("Wizard") || baka1.equals("Warrior") || baka1.equals("Rogue")) ) {
			System.out.println("Please input a valid character idiot. Do you know how to spell? Are you illiterate?");
			System.out.println("Would you like to be a Wizard, Warrior, or Rogue? Make sure it's capital");
			baka1 = sc.nextLine();
		}
	
		int points = (25);
		System.out.println("You have 25 points to use on the five heroic traits: Strength, Dexterity, Intelligence, Constitution, Charisma. Spend your points wisely.");
		
		
		int Strength = (0);
		while(true){
		System.out.println("Strength(1-10)");
		Strength = sc.nextInt();
		if (Strength > 10 || points-Strength<0){
		System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-Strength;
			break;
		}
		}
		
		int Dexterity = (0);
		while(true){
		System.out.println("Dexterity(1-10)");
		Dexterity = sc.nextInt();
		if (Dexterity > 10 || points-Dexterity<0){
		System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-Dexterity;
			break;
		}
		}
		
		int Intelligence = (0);
		while(true){
		System.out.println("Intelligence(1-10)");
		Intelligence = sc.nextInt();
		if (Intelligence > 10 || points-Intelligence<0){
		System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-Intelligence;
			break;
		}
		}
		
		int Constitution = (0);
		while(true){
		System.out.println("Constitution(1-10)");
		Constitution = sc.nextInt();
		if (Constitution > 10 || points-Constitution<0){
		System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-Constitution;
			break;
		}
		}
		
		int Charisma = (0);
		while(true){
		System.out.println("Charisma(1-10)");
		Charisma = sc.nextInt();
		if (Charisma > 10 || points-Charisma<0){
		System.out.println("You don't have enough points, choose again");
		}
		else{
			points = points-Charisma;
			break;
		}
		}
		
		if(Strength + Dexterity + Intelligence + Constitution + Charisma > 25){
			
		}
	
		
		System.out.println("Your cool edgy name is " + yurname);
		System.out.println("Your cool senpai title is " + yurtitlefs);
		System.out.println("You are a " + baka1 + " with the following stats:");
		System.out.println("Strength = " + Strength);
		System.out.println("Dexterity = " + Dexterity);
		System.out.println("Intelligence = " + Intelligence);
		System.out.println("Constitution = " + Constitution);
		System.out.println("Charisma = " + Charisma);
		System.out.println("And you have "+points+" points left");
	}
}	
		