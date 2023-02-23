/*
 * [PayoffDebt].java
 * Author:  [Khang Vu] 
 * Submission Date:  [February 5th 2023]
 *
 * Purpose: Program takes in input of debts such as principal and interest rate and calculates the time, amount of money owed, and other debt based calculations and displays it for the user to see.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner;

public class PayoffDebt {

	public static void main(String[] args) {
		double principal, annualInterestRate, monthlyPayment;
		
		double monthsNeededToPayOff;
		int MonthsNeededToPayOff;
		
		double totalInterestPaid, totalAmountPaid, overpayment;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the Principal, Annual Interest Rate (%), and Monthly Payment");
		
		System.out.print("Principal: ");
		principal = keyboard.nextDouble();
		System.out.print("Annual Interest Rate (%): ");
		annualInterestRate = keyboard.nextDouble();
		System.out.print("Monthly Payment: ");
		monthlyPayment = keyboard.nextDouble();
		System.out.print("\n");

		
		monthsNeededToPayOff = (Math.log(monthlyPayment) - Math.log(monthlyPayment - (annualInterestRate/1200) * principal)) / Math.log(annualInterestRate/1200 +1.0);
		
		MonthsNeededToPayOff = (int) Math.ceil(monthsNeededToPayOff);
		
		totalAmountPaid = MonthsNeededToPayOff * monthlyPayment;
		
		totalInterestPaid = totalAmountPaid - principal;
		
		//overpayment equals the difference between the ceiling of the "months needed to pay off" stored as an integer and the raw value of "months needed to pay off" as a double 
		//which is then multiplied by the monthly payment;
		overpayment = (MonthsNeededToPayOff - monthsNeededToPayOff) * monthlyPayment;
		
		//output here
		
		System.out.println("Principal: \t \t \t" + principal);
		System.out.println("Annual Interest Rate (%): \t" + annualInterestRate);
		System.out.println("Monthly Payment: \t \t" + monthlyPayment +"\n");
		
		System.out.println("Months Needed TO Pay Off: \t" + MonthsNeededToPayOff);
		System.out.printf("Total Amount Paid: \t \t" + "$" + String.format("%.2f", totalAmountPaid) + "\n");
		System.out.printf("Total Interest Paid: \t \t" + "$" + String.format("%.2f",totalInterestPaid) + "\n");
		System.out.printf("Overpayment: \t \t \t" + "$" + String.format("%.2f",overpayment));

		keyboard.close();


	}

}
