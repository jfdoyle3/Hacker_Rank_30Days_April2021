import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {

		double tip = meal_cost * (tip_percent * .01);
		double tax = meal_cost * (tax_percent * .01);
		double total_meal_cost = tax + meal_cost;

		double total_cost = total_meal_cost + tip;
		int costRounded = (int) Math.round(total_cost);

		System.out.println(costRounded);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();
	}
}
