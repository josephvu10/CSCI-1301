import java.util.Scanner;

/**
 * 
 * @author Khang Vu
 *
 */
public class HelloWorld {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/*double input;
		
		System.out.println("Hello World!");
		System.out.println("Please enter a number: ");
		
		input = keyboard.nextDouble();
	
		
		System.out.printf("Each receives $ %.2f", input);
		System.out.println("");
		System.out.println("1 = 2 = " + 1 + 2);
		System.out.println("1 = 2 = " + (1 + 2));
		
		int x = 1;
		
		x *= x + 1;
		
		System.out.println(x);
		
		double usDollar, chineseYuan, exchangeRate;
		
		System.out.print("Enter the exchange rate from dollars to Yuan: ");

		exchangeRate = keyboard.nextDouble();

		System.out.print("Enter the dollar amount: ");

		usDollar = keyboard.nextDouble();

		chineseYuan = usDollar * exchangeRate;

		System.out.println("$" + String.format("%.2f", usDollar) + " is " + String.format("%.2f", chineseYuan) + " Yuan");
		*/
		int input;
		
	    System.out.print("Enter an integer input: ");
	    
	    input = keyboard.nextInt();
	    
	      if ((input % 2) == 0)
	        System.out.println("The input is even");
	      else if ((input % 2) == 1)
	        System.out.println("The input is odd");

	      boolean even = false;
	      if (even) {
	         System.out.println("It is even!");
	      }
	      
	      
	      int diff = "status".compareTo("stars");
	    System.out.println("\\\\");
		keyboard.close();

	}

}
