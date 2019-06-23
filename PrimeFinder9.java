import java.util.Scanner;
public class PrimeFinder9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 2;
		int count = 1;
		boolean seek = true;
		int factor = 0;
		
		System.out.print("Choose a number to determine primality: ");
		count = scan.nextInt();
		scan.nextLine();
		
		while (seek == true)
		{
			while (n < count)
			{
				if (count % n == 0)
				{
					factor++;
				}
				n++;
			}
			
			if (factor == 0)
			{	
				System.out.println(count + " is prime.");
				String choice = scan.nextLine();
				if (choice.equalsIgnoreCase("n"))
				{
					seek = false;
				}
			} else {
				System.out.println(count + " is not prime.");
				seek = false;
			}
			
			count++;
			factor = 0;
			n = 2;
		}
	scan.close();
	}
}