package test;

import java.util.Arrays;
import java.util.Scanner;

public class AppMain{
	public static void main(String[] args){
		System.out.println("hallo welt");
		System.out.println("print args array: " + Arrays.toString(args));

		var nums = scan_numbers();

		execute_computation_exercises(nums[0], nums[1]);
	}

	static int[] scan_numbers(){

		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Enter two numbers to add: ");
		System.out.println("first number: ");
		int first_number = Integer.parseInt(myScanner.nextLine());  // Read user input
		System.out.println("second number: ");
		int second_number = Integer.parseInt(myScanner.nextLine());  // Read user input

		return new int[]{first_number, second_number};
	}
	public static void execute_computation_exercises(int first_number, int second_number){

		int sum = ComputeExercise.add(first_number, second_number);
		System.out.println(first_number + " + " + second_number + " is " + sum);


		if (ComputeExercise.equal(first_number, second_number)){
			System.out.println(first_number + " ist gleich " + second_number);
		} else{
			if(ComputeExercise.smaller(first_number, second_number)){
				System.out.println(first_number + " ist kleiner als " + second_number);
			} else {
				System.out.println(first_number + " ist größer als " + second_number);
			}
		}
	}
}

