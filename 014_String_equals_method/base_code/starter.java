import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rouge? Make sure it's capital");
		String baka1 = sc.nextLine();
		String wizard = ("Wizard");
		String warrior = ("Warrior");
		String rouge = ("Rouge");
		
		if(baka1.equals(wizard)){
			System.out.println("Ur a wiz senpai!");
		}
			else if(baka1.equals(warrior)){
			System.out.println("Ur super strong warrior senpai!");
			}
				else if(baka1.equals(rouge)){
				System.out.println("Ur a edgy rouge senpai!");
				}
					else{
					System.out.println("Please input a valid character idiot. Do you know how to spell? Are you illiterate?");
					}
			
	}
}