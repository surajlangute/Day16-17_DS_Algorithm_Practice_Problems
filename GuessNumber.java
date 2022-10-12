package day16_17_AlgorithmProgram;

import java.util.Scanner;

public class GuessNumber {
	public int search(int low, int high) {
		if ((high - low) == 1)
			return low;
		int mid = low + (high - low) / 2;
		System.out.printf("is number is less than %d? type true or false : ", mid);
		boolean isLessThan = scanner.nextBoolean();
		if (isLessThan)
			return search(low, mid);
		else
			return search(mid, high);
	}

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		GuessNumber findNumber = new GuessNumber();
		System.out.println("guess the number of your choice");
		int number = scanner.nextInt();
		int high = (int) Math.pow(2, number);
		int yourNumber = findNumber.search(0, high);
		System.out.printf("your guessed number is %d\n", yourNumber);

	}

	// TODO Auto-generated method stub

}
