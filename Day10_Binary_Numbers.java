import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void binaryNumbers(int baseTen) {

        List<Integer> binaryNumber = new ArrayList<>();
        int oneCounter = 0;
        int totalOfOnes = 0;

        List<Integer> countOfOnes = new ArrayList<>();

        do {
            int quotient = baseTen / 2;
            int remainder = baseTen % 2;
            baseTen = quotient;
            binaryNumber.add(remainder);
        } while (baseTen > 0);

        Collections.reverse(binaryNumber);

        for (int index = 0; index < binaryNumber.size(); index++) {
            if (binaryNumber.get(index) == 1) {
                oneCounter++;
                totalOfOnes = oneCounter;
                countOfOnes.add(totalOfOnes);
            } else
                oneCounter = 0;
        }
        Collections.sort(countOfOnes);
        Collections.reverse(countOfOnes);
        System.out.println(countOfOnes.get(0));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        binaryNumbers(n);

        scanner.close();
    }
}
