import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static void problem(int[][] arr){
        int top,middle,bottom,total,highestNumber=0;
        
        for(int coordX=0; coordX<4; coordX++){
            for(int coordY=0; coordY<4; coordY++){
                
                top=arr[coordX][coordY]+arr[coordX][coordY+1]+arr[coordX][coordY+2];
                middle=arr[coordX+1][coordY+1];
                bottom=arr[coordX+2][coordY]+arr[coordX+2][coordY+1]+arr[coordX+2][coordY+2];
                
                total=top+middle+bottom;
                
                if(total>highestNumber)
                    highestNumber=total;
            } 
        }
       System.out.printf("%d",highestNumber);
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        problem(arr);
        scanner.close();
    }
}
