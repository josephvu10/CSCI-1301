/*
 * [ParseTheTweet].java
 * Author:  [Khang Vu] 
 * Submission Date:  [February 12 2023]
 *
 * Purpose: program goes through a tweet and breaks up the tweet according to the information provided and then redisplays that information so it is easier to read
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

public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String type, location, detail;
		String Latitude, Longitude;
		double latitude, longitude;
		int start;
		int end;
		
		System.out.println("Enter a tweet below");
		
		String tweet = keyboard.nextLine();
		
		start = tweet.indexOf('#');
		end = tweet.indexOf(';');
		
		type = tweet.substring((start + 5),end);
		type.trim();
		tweet = tweet.substring(end + 1);
		
		start = tweet.indexOf('#');
		end = tweet.indexOf(';');
		
		detail = tweet.substring((start + 5),end);
		detail.trim();
		detail.replace(',', '-');
		tweet = tweet.substring(end + 1);
		
		start = tweet.indexOf('#');
		end = tweet.indexOf(';');

		location = tweet.substring((start + 5),end);
		location.trim();
		location.replace(',', '-');
		tweet = tweet.substring(end + 1);
		
		start = tweet.indexOf('#');
		end = tweet.indexOf(';');

		Latitude = tweet.substring(start + 5,end);
		Latitude.trim();
		latitude = Double.valueOf(Latitude);
		tweet = tweet.substring(end + 1);

		start = tweet.indexOf('#');
		end = tweet.indexOf(';');
		
		Longitude = tweet.substring(start + 5,end);
		Longitude.trim();
		longitude = Double.valueOf(Longitude);
		tweet = tweet.substring(end + 1);
		
		System.out.println("Type: \t\t" + type.toUpperCase());
		System.out.println("Detail: \t" + detail.replace(',', '-'));
		System.out.println("Location: \t" + location.replace(',', '-'));
		System.out.println("Latitude: \t" + latitude);
		System.out.println("Longitude: \t" + longitude);
	
		keyboard.close();
		
	}

}
