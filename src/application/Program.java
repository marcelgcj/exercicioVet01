package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("How many people do you want to register? ");
		int n = scan.nextInt();
		scan.nextLine();
		double[] vect = new double[n];
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the hight: ");
			vect[i] = scan.nextDouble();
			scan.nextLine();
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.println();
		System.out.printf("Average high: %.2f", avg);

		scan.close();
	}

}
