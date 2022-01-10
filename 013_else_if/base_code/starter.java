import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input ur number");
	int x = sc.nextInt();
	
	Random rand = new Random();
	int uwukun = rand.nextInt(1001);
	
	if (x>uwukun){
	System.out.println("The number is smaller");
	System.out.println("This was the number - " + uwukun);
	}
	else if (x<uwukun){
	System.out.println("The number is larger");
	System.out.println("This was the number, " + uwukun);
	}	

	}
}
