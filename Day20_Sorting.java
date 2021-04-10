import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void sort(int[] array, int number) {
		int arrLen = array.length - 1;
		int numSwaps = 0;

		for (int idx = 0; idx < number; idx++) {
			for (int idx2 = 0; idx2 < number - 1; idx2++) {
				if (array[idx2] > array[idx2 + 1]) {
					int tempswap = a[idx2];
					array[idx2] = array[idx2 + 1];
					array[idx2 + 1] = tempswap;
					numSwaps++;
				}
			}
			if (numSwaps == 0) {
				break;
			}
		}

		System.out.printf("Array is sorted in %d swaps.\n", numSwaps);
		System.out.printf("First Element: %d\n", array[0]);
		System.out.printf("Last Element: %d\n", array[arrLen]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		sort(a, n);
	}
}
