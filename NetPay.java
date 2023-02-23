/*
 * [NetPay].java
 * Author:  [Khang Vu] 
 * Submission Date:  [1/23/2023]
 *
 * Purpose: Program is for lab 2 and takes in an input for the amount of hours worked per week and then calculates the deductions within the paycheck. 
 * Finally, program displays the pay and deductions of the paycheck.
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
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */


import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		double input;
		double grossPay;
		double netPay;
		double federal, state, SS, medicare;

		
		
		System.out.print("Please enter a number: ");
		
		Scanner hours = new Scanner(System.in);
		input = hours.nextDouble();
		
		System.out.println("Hours worked is: " + input);
		
		grossPay = input * PAY_PER_HOUR;
		federal = (grossPay * (FEDERAL_TAX_PERCENT / 100));
		state = (grossPay * (STATE_TAX_PERCENT / 100));
		SS = (grossPay * (SS_PERCENT / 100));
		medicare = (grossPay * (MEDICARE_PERCENT / 100));
		netPay = grossPay - federal - state - SS - medicare;

		
		System.out.println("Hours per Week:" + "\t" + "\t" + input);
				
		System.out.println("Gross Pay:" + "\t" + "\t" +  grossPay);
		
		System.out.println("Net Pay:" + "\t" + "\t" +  netPay + "\n");
		
		System.out.println("Deductions");
		
		System.out.println("Federal:" + "\t" + "\t" +  federal);
		
		System.out.println("State:" + "\t" + "\t" + "\t" +  state);
		
		System.out.println("Social Security:" + "\t" +  SS);
		
		System.out.println("Medicare:" + "\t" + "\t" +  medicare);
		
		hours.close();
	}

}
