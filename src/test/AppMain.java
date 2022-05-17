package test;

import java.util.Arrays;
import java.util.Scanner;

public class AppMain{
	public static void main(String[] args){
		System.out.println("hallo welt");
		System.out.println("print args array: " + Arrays.toString(args));

		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Enter two numbers to add: ");
		System.out.println("first number: ");
		int first_number = Integer.parseInt(myScanner.nextLine());  // Read user input
		System.out.println("second number: ");
		int second_number = Integer.parseInt(myScanner.nextLine());  // Read user input


		int result = ComputeExercise.add(first_number, second_number);

		System.out.println(first_number + " + " + second_number + " is " + result);
	}
}

