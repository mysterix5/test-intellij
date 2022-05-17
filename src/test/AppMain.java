package test;

import java.util.Arrays;
import java.util.Scanner;

public class AppMain{
	public static void main(String[] args){
		System.out.println("hallo welt");
		System.out.println("print args array: " + Arrays.toString(args));

		//var nums = scan_numbers();
		var nums = new int[]{4,5};

		execute_computation_exercises(nums[0], nums[1]);

		test_and_print_string("sdöflkjasödlkfjasöldkfjaöslkfjaöslkdj");
		test_and_print_string("sdffancydd");
		test_and_print_string("asdf");
		test_and_print_string("sdöflkjasödlkfjasöldkfancyjaöslkfjaöslkdj");

	}

	static void test_and_print_string(String s){
		var test = StringExercise.test_string(s);
		System.out.println("testing string: " + s + ": " + test);
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

		int sum = IntExercise.add(first_number, second_number);
		System.out.println(first_number + " + " + second_number + " is " + sum);
		IntExercise.print_sum(sum);


		if (IntExercise.equal(first_number, second_number)){
			System.out.println(first_number + " ist gleich " + second_number);
		} else{
			if(IntExercise.smaller(first_number, second_number)){
				System.out.println(first_number + " ist kleiner als " + second_number);
			} else {
				System.out.println(first_number + " ist größer als " + second_number);
			}
		}
	}
}

