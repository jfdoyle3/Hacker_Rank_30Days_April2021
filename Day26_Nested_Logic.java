import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Solution {

	public static void main(String[] args) {

		List<String> dates = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for (int idx = 0; idx < 2; idx++) {
			String date = input.nextLine();
			dates.add(date);
		}
		String[] strReturnDate = dates.get(0).split(" ");
		String[] strExpectedReturnDate = dates.get(1).split(" ");
		int[] intReturnDate = new int[strReturnDate.length];
		int[] intExpectedReturnDate = new int[strExpectedReturnDate.length];
		for (int idx = 0; idx < strReturnDate.length; idx++) {
			intReturnDate[idx] = Integer.parseInt(strReturnDate[idx]);
			intExpectedReturnDate[idx] = Integer.parseInt(strExpectedReturnDate[idx]);
		}

		int days = intReturnDate[0] - intExpectedReturnDate[0];
		int months = intReturnDate[1] - intExpectedReturnDate[1];
		int years = intReturnDate[2] - intExpectedReturnDate[2];


		if (days > 1 && days < 31 && months == 0 && years == 0)
			System.out.println(days * 15);

		if (months > 1 && years == 0)
			System.out.println(months * 500);

		if (years > 0)
			System.out.println(10000);

		if (days < 0 || months < 0 || years < 0)
			System.out.println(0);
	}
}
