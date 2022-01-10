import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input ur first number");
		int x = sc.nextInt();
		
		System.out.println("Please input ur second number");
		int y = sc.nextInt();
		
		System.out.println("Please input ur second number");
		int z = sc.nextInt();
		
		if((x>y)&&(x>z))
		{
		System.out.println("Ur first number is the largerst");
		}
		if((y>x)&&(y>z))
		{
		System.out.println("Ur second number is the largerst");
		}
		if((z>x)&&(z>y))
		{
		System.out.println("Ur third number is the largerst");
		}
		if((x<y)&&(x<z))
		{
		System.out.println("Ur first number is the smallest");
		}
		if((y<x)&&(y<z))
		{
		System.out.println("Ur second number is the smallest");
		}
		if((z<x)&&(z<y))
		{
		System.out.println("Ur third number is the smallest");
		}
		
	}
}
