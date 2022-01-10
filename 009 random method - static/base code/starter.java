import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

Random rand = new Random();
double rand_num2 = rand.nextDouble();

int uwukun = rand.nextInt(10);
int uwukun2 = rand.nextInt(100)+1;
double uwukun3 = rand.nextDouble()+2.5;
double uwukun4 = rand.nextDouble()+14;
int uwukun5 = rand.nextInt(575);
	
System.out.println(uwukun);
System.out.println(uwukun2);
System.out.println(uwukun3);
System.out.println(uwukun4+uwukun5);
	}
}
