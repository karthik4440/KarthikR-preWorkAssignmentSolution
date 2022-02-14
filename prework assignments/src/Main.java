import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("Enter the number of rows ");
		int number = sc.nextInt();
		int sum = 0;
		int rem, n = number;
		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		if (number == sum) {
			System.out.println("Its a Palindrome number");
		} else {
			System.out.println("Its not a Palindrome number");
		}
	}

	// function to printPattern

	public void printPattern() {
		System.out.println("Enter the number of rows ");
		int rows = sc.nextInt();
		for (int i = rows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("Enter a number ");
		int flag = 0;
		int number = sc.nextInt();
		int mid = number / 2;
		if (number == 0 || number == 1) {
			System.out.println("Its not a prime number");
		} else {
			for (int i = 2; i <= mid; i++) {
				if (number % i == 0) {
					System.out.println("Its not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Its a prime number");
			}
		}

	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1, next, number;
		System.out.println("Enter the number of series ");
		number = sc.nextInt();
		System.out.print(first + " " + second);
		for (int i = 2; i < number; i++) {
			next = first + second;
			System.out.print(" " + next);
			first = second;
			second = next;
		}
	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}