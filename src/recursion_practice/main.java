package recursion_practice;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to my recursion practice app!"
				+ "\nI followed a very helpful youtube video for this."
				+ "\nFeel free to reach out if you want the link to the video!"
				+ "\n");
		
		
		//print numbers from choice down to 1
		System.out.println("Please enter a number to count down from: ");
		int choice = scnr.nextInt();
		System.out.println("Printing numbers down from " + choice + " to 1");
		printNumbers(choice);
		
		//total cat eyes
		System.out.println("How many cats are we going to add the eyes up for?");
		int cats = scnr.nextInt();
		System.out.println("Total Cat Eyes: " + catEyes(cats));

		//powers
		System.out.println("Please enter a number power value:");
		System.out.println("Number: ");
		int num2 = scnr.nextInt();
		System.out.println("Power: ");
		int power = scnr.nextInt();
		System.out.println(num2 + " to the " + power + " power equals:");
		System.out.println(power(num2, power));
			
		//factorial
		System.out.println("What number would you like to find the factorial of?:");
		int fact = scnr. nextInt();
		System.out.println("Factorial of " + fact + " equals: " +factorial(fact));
	
		//fibonacci finder
		System.out.println("What position of the fibonacci series would you like to see? (0 is the first position):");
		int fib = scnr.nextInt();
		System.out.println("The fibonacci number at position " + fib + " is: " + fibonacci(fib));
	
		//phone speaker calculator
		System.out.println("How many phones do we have?:");
		int phones = scnr.nextInt();
		System.out.println("All " + phones + " phones we have are numbered 1 through " + phones);
		System.out.println("Phones with even numbers have 2 speakers, phones with odd numbers have 1 speaker");
		System.out.println("Total Number of Speakers: " + mobileSpeakers(phones));
	
		//sum of digits
		System.out.println("Enter a number to get the sum of its digits: ");
		int sumDigits = scnr.nextInt();
		System.out.println("Sum of digits: " + sum(sumDigits));
	
		//count all occurrences of number 5
		System.out.println("Enter a number and the program will return all the occurences of the digit '5': ");
		int five = scnr.nextInt();
		System.out.println("The number '5' appeared " + count5(five) + " times");
	
		//binary search
		System.out.println("Please add 9 numbers to our array:");
		int [] array = new int[9];
		for(int i = 0; i < 9; i++) {
			int add = scnr.nextInt();
			array[i] = add;
		}
		System.out.println("What number would you like to find the index of in our array?:");
		int key = scnr.nextInt();
		System.out.println("The index of " + key + " in our arary is " + binarySearch(array, key, 0, array.length -1));
		System.out.println("Remeber the first index of an array is 0");
		System.out.println("Here is our array for reference: " + Arrays.toString(array));
		
		System.out.println("\nThanks for checking out my recursion practice app, goodbye!");
	}
	
	//print numbers down to 1
	public static void printNumbers(int num) {
		if(num == 0) {
			return;
		}
		else {
			System.out.println(num);
			printNumbers(num -1);
		}
	}
	
	//total cat eyes
	public static int catEyes(int cats) {
		if (cats == 0) {
			return 0;
		} else {
			return 2 + catEyes(cats -1);
		}
	}
	
	//power calculator 
	public static int power(int base, int num) {
		if (num == 1) {
			return base;
		} else {
			return base * power(base, num -1);
		}
	}
	
	//factorial calculator
	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
	
	//fibonacci series
	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} if (num == 1) {
			return 1;
		} else {
			return fibonacci(num -1) + fibonacci(num -2);
		}
	}
	
	//total speakers on phones
	public static int mobileSpeakers(int mobiles) {
		if (mobiles == 0) {
			return 0;
		} else {
			if (mobiles % 2 == 0) {
				return 2 + mobileSpeakers(mobiles -1);
			} else {
				return 1 + mobileSpeakers(mobiles -1);
			}
		}
	}
	
	//sum of all digits in number
	public static int sum(int num) {
		if (num <= 9) {
			return num;
		} else {
			return num % 10 + sum(num / 10);
		}
	}
	
	//count all occurrences of number 5
	public static int count5(int num) {
		if (num <= 9) {
			if(num == 5) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if(num % 10 == 5) {
				return 1 + count5(num / 10);
			} else {
				return 0 + count5(num / 10);
			}
		}
	}
	
	//binary search
	public static int binarySearch (int [] array, int key, int start, int end) {
		if (start <= end) {
			int middle = (start + end)/2;
			if(array[middle] > key) {
				return binarySearch(array, key, start, middle -1);
			} else if (array[middle] < key) {
				return binarySearch(array, key, middle +1, end);
			} else {
				return middle;
			}
		} else {
			return -1;
		}
	}
}
