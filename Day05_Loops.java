import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static void multiplicationTable(int number){
     
     for (int idx=1; idx<=10; idx++){
         System.out.println(number+" x "+idx+" = "+number*idx);
     }
 }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        multiplicationTable(n);
        
        scanner.close();
        
    }
}
