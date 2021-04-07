//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    private static HashMap<String,Integer> phoneBook=new HashMap<>();

    public static void main(String []argh){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0; i < number; i++){
            String name = input.next();
            int phoneNumber = input.nextInt();
            // Write code here
            phoneBook.put(name,phoneNumber);
        }
        while(in.hasNext()){
            String name = input.next();
            // Write code here
            if (phoneBook.containsKey(name)){
                System.out.println(name+"="+phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        input.close();
    }
}