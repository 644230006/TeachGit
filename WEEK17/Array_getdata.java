package WEEK17;

import java.util.Scanner;

public class Array_getdata {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int [] number = new int [2];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter number : ");
             number [i]= kb.nextInt();
        }
        int sum = 0;
        System.out.print("{ ");
        for (int i : number) {
            System.out.print(","+i);
            
            sum = sum + i;
        }
        
        
        
        System.out.println("}");
        System.out.println("ผมรวมเท่ากับ  "+sum);
        kb.close();
    }
}
