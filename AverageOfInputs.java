import java.util.Scanner;

public class AverageOfInputs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double NUMDIV = 3.0;
		
		double input1, input2, input3;
		double output;
		
		System.out.println("Please enter three numbers: ");
		
		input1 = input.nextDouble();
		input2 = input.nextDouble();
		input3 = input.nextDouble();
		
		output = (input1 + input2 + input3) / NUMDIV;
		
		System.out.println("The average of the three numbers is: " + output);
		
	}

}
