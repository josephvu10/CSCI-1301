/*
 * [GradeCalculator].java
 * Author:  [Khang Vu] 
 * Submission Date:  [February 20 2023]
 *
 * Purpose: Program asks user for a variety of information in regards to their course grade and if the information provided 
 * meets the acceptable conditions of the program allows the user to calculate their grade and see if it reaches the grade they wish to receive
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

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String desiredGrade;
		double currentGrade;
		String currentGradeLetter = "";
		double exam1Weight, exam2Weight, finalExamWeight, labsWeight, projectsWeight, participationWeight, quizzesWeight;
		double exam1, exam2, finalExam, labs, projects, participation, quizzes;
		String exam1Confirm, exam2Confirm, finalExamConfirm, labsConfirm, projectsConfirm, participationConfirm, quizzesConfirm;
		double totalKnownGradeWeight;
		double finalOverallScore = 0;
		double avgToFinalLetterGrade;
		
		System.out.println("Grading Scale:");
		System.out.println("A \t 90 - 100");
		System.out.println("B \t 80 - 89");
		System.out.println("C \t 70 - 79");
		System.out.println("D \t 60 - 69");
		System.out.println("F \t below 60");
		
		System.out.print("What letter grade do you want to achieve for the course?");
		
		desiredGrade = keyboard.next();
		
		if(desiredGrade.equalsIgnoreCase("A") || desiredGrade.equalsIgnoreCase("B") || desiredGrade.equalsIgnoreCase("C") || desiredGrade.equalsIgnoreCase("D") || desiredGrade.equalsIgnoreCase("F")) {
			System.out.println("Enter percentage weights below.");
			System.out.print("Exam 1: \t \t");
			exam1Weight = keyboard.nextDouble();
			System.out.print("Exam 2: \t \t");
			exam2Weight = keyboard.nextDouble();
			System.out.print("Final Exam: \t \t");
			finalExamWeight = keyboard.nextDouble();
			System.out.print("Labs: \t \t \t");
			labsWeight = keyboard.nextDouble();
			System.out.print("Projects: \t \t");
			projectsWeight = keyboard.nextDouble();
			System.out.print("Participation: \t \t");
			participationWeight = keyboard.nextDouble();
			System.out.print("Quizzes: \t \t");
			quizzesWeight = keyboard.nextDouble();
			
			totalKnownGradeWeight = 0;
			exam1 = 0;
			exam2 = 0;
			finalExam = 0;
			labs = 0;
			projects = 0;
			participation = 0;
			quizzes = 0;
			
			if ((exam1Weight + exam2Weight + finalExamWeight + labsWeight + projectsWeight + participationWeight + quizzesWeight) == 100) {
				System.out.print("Do you know your exam 1 score?");
				exam1Confirm = keyboard.next();
				if (exam1Confirm.equalsIgnoreCase("YES") || exam1Confirm.equalsIgnoreCase("Y")) {
					System.out.print("Score received on exam 1:");
					exam1 = keyboard.nextDouble();
					if(exam1 >= 0 && exam1 <= 100) {
						totalKnownGradeWeight = totalKnownGradeWeight + exam1Weight;
					}
					else {
						System.out.println("Invalid input!");
					}
					
					System.out.print("Do you know your exam 2 score?");
					exam2Confirm = keyboard.next();
					if (exam2Confirm.equalsIgnoreCase("YES") || exam2Confirm.equalsIgnoreCase("Y")) {
						System.out.print("Score received on exam 2:");
						exam2 = keyboard.nextDouble();
						if(exam2 >= 0 && exam2 <= 100) {
							totalKnownGradeWeight = totalKnownGradeWeight + exam2Weight;
						}
						else {
							System.out.println("Invalid input!");
						}
						
						System.out.print("Do you know your final exam score?");
						finalExamConfirm = keyboard.next();
						if (finalExamConfirm.equalsIgnoreCase("YES") || finalExamConfirm.equalsIgnoreCase("Y")) {
							System.out.print("Score received on final exam:");
							finalExam = keyboard.nextDouble();
							if(finalExam >= 0 && finalExam <= 100) {
								totalKnownGradeWeight = totalKnownGradeWeight + finalExamWeight;
							}
							else {
								System.out.println("Invalid input!");
							}
						}
					}
				}
				
				System.out.print("Do you know your lab average?");
				labsConfirm = keyboard.next();
				if (labsConfirm.equalsIgnoreCase("YES") || labsConfirm.equalsIgnoreCase("Y")) {
					System.out.print("Average lab grade:");
					labs = keyboard.nextDouble();
					if(labs >= 0 && labs <= 100) {
						totalKnownGradeWeight = totalKnownGradeWeight + labsWeight;
					}
					else {
						System.out.println("Invalid input!");
					}
				}
				System.out.print("Do you know your project average?");
				projectsConfirm = keyboard.next();
				if (projectsConfirm.equalsIgnoreCase("YES") || projectsConfirm.equalsIgnoreCase("Y")) {
					System.out.print("Average project grade:");
					projects = keyboard.nextDouble();
					if(projects >= 0 && projects <= 100) {
						totalKnownGradeWeight = totalKnownGradeWeight + projectsWeight;
					}
					else {
						System.out.println("Invalid input!");
					}
				}
				System.out.print("Do you know your participation average?");
				participationConfirm = keyboard.next();
				if (participationConfirm.equalsIgnoreCase("YES") || participationConfirm.equalsIgnoreCase("Y")) {
					System.out.print("Average participation grade:");
					participation = keyboard.nextDouble();
					if(participation >= 0 && participation <= 100) {
						totalKnownGradeWeight = totalKnownGradeWeight + participationWeight;
					}
					else {
						System.out.println("Invalid input!");
					}
				}
				System.out.print("Do you know your quiz average?");
				quizzesConfirm = keyboard.next();
				if (quizzesConfirm.equalsIgnoreCase("YES") || quizzesConfirm.equalsIgnoreCase("Y")) {
					System.out.print("Average quiz grade:");
					quizzes = keyboard.nextDouble();
					if(quizzes >= 0 && quizzes <= 100) {
						totalKnownGradeWeight = totalKnownGradeWeight + quizzesWeight;
					}
					else {
						System.out.println("Invalid input!");
					}
				}
				
				currentGrade = ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight)) / (totalKnownGradeWeight);
				System.out.println("Current grade score:" + String.format("%.2f", currentGrade));
				
				if(currentGrade >= 90 && currentGrade <= 100) {
					currentGradeLetter = "A";
				}
				else if(currentGrade >= 80 && currentGrade < 90) {
					currentGradeLetter = "B";
				}
				else if(currentGrade >= 70 && currentGrade < 80) {
					currentGradeLetter = "C";
				}
				else if(currentGrade >= 60 && currentGrade < 70) {
					currentGradeLetter = "D";
				}
				else if(currentGrade < 60) {
					currentGradeLetter = "F";
				}
				
				System.out.println("Your current letter grade:" + currentGradeLetter);
				
				if(currentGradeLetter.equalsIgnoreCase(desiredGrade) == true) {
					System.out.println("Congratulations! You received the " + desiredGrade + " that you wanted!");
				}
				else {
					if(totalKnownGradeWeight != 100) {
						if(desiredGrade.equalsIgnoreCase("A")) {
							finalOverallScore = 90;
							avgToFinalLetterGrade = ((100 * finalOverallScore) - ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight))) / (100 - totalKnownGradeWeight);
							if(avgToFinalLetterGrade <= 100 && avgToFinalLetterGrade >=0) {
								System.out.println("In order to receive a grade of A, \nyou need to score an average greater than \nor equal to " + String.format("%.2f",avgToFinalLetterGrade) + " in the rest of the grade items.");
							}
							else if(avgToFinalLetterGrade < 0) {
								System.out.println("You will receive at least a grade of A");
							}
							else
								System.out.println("Unfortunately, a grade of A is not possible.");
						}
						else if(desiredGrade.equalsIgnoreCase("B")) {
							finalOverallScore = 80;
							avgToFinalLetterGrade = ((100 * finalOverallScore) - ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight))) / (100 - totalKnownGradeWeight);
							if(avgToFinalLetterGrade <= 100 && avgToFinalLetterGrade >= 0) {
								System.out.println("In order to receive a grade of B, \nyou need to score an average greater than \nor equal to " + String.format("%.2f",avgToFinalLetterGrade) + " in the rest of the grade items.");
							}
							else if(avgToFinalLetterGrade < 0) {
								System.out.println("You will receive at least a grade of B");
							}
							else
								System.out.println("Unfortunately, a grade of B is not possible.");
						}
						else if(desiredGrade.equalsIgnoreCase("C")) {
							finalOverallScore = 70;
							avgToFinalLetterGrade = ((100 * finalOverallScore) - ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight))) / (100 - totalKnownGradeWeight);
							if(avgToFinalLetterGrade <= 100 && avgToFinalLetterGrade >= 0) {
								System.out.println("In order to receive a grade of C, \nyou need to score an average greater than \nor equal to " + String.format("%.2f",avgToFinalLetterGrade) + " in the rest of the grade items.");
							}
							else if(avgToFinalLetterGrade < 0) {
								System.out.println("You will receive at least a grade of C");
							}
							else
								System.out.println("Unfortunately, a grade of C is not possible.");
						}
						else if(desiredGrade.equalsIgnoreCase("D")) {
							finalOverallScore = 60;
							avgToFinalLetterGrade = ((100 * finalOverallScore) - ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight))) / (100 - totalKnownGradeWeight);
							if(avgToFinalLetterGrade <= 100 && avgToFinalLetterGrade >= 0) {
								System.out.println("In order to receive a grade of D, \nyou need to score an average greater than \nor equal to " + String.format("%.2f",avgToFinalLetterGrade) + " in the rest of the grade items.");
							}
							else if(avgToFinalLetterGrade < 0) {
								System.out.println("You will receive at least a grade of D");
							}
							else
								System.out.println("Unfortunately, a grade of D is not possible.");
						}
						else if(desiredGrade.equalsIgnoreCase("F")) {
							finalOverallScore = 0;
							avgToFinalLetterGrade = ((100 * finalOverallScore) - ((exam1 * exam1Weight) + (exam2 * exam2Weight) + (finalExam * finalExamWeight) + (labs * labsWeight) + (projects * projectsWeight) + (participation * participationWeight) + (quizzes * quizzesWeight))) / (100 - totalKnownGradeWeight);
							System.out.println("At least you can always get a F.");
						}
						
					}
					else if(totalKnownGradeWeight == 100) {
						System.out.println("Unfortunately, a grade of " + desiredGrade.toUpperCase() + " is not possible.");
					}
					
				}
					
			}
			else {
				System.out.println("Weights don’t add up to 100, program exiting...");
				System.exit(0);
			}
			
		}
		else
			System.out.println("The input is invalid.");
		
		
		keyboard.close();
		
	}

}
