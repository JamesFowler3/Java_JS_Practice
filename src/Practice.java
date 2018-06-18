import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;


public class Practice {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Reversing a String
        System.out.println("Reverse me");
        String str = scanner.nextLine();
        String reverse = "";

        for(int i = str.length() - 1; i >=0; i--)
        {
          reverse = reverse + str.charAt(i);
        }
            System.out.println("Reverse me");

        System.out.println(reverse);
        }


        S

        int N = scanner.nextInt();

        boolean FizzorBuzz = false;

        if(N % 3 == 0){
            System.out.println("Fizz");
            FizzorBuzz = true;
    }
        if(N % 5 == 0){
            System.out.println("Buzz");
            FizzorBuzz = true;
    }
    if(FizzorBuzz){
            System.out.println();
    }
    else {
            System.out.println(String.valueOf(N));
    }




//            int N = scanner.nextInt();
//            //Fizzbuzz Exercise
//            {
//            boolean fizzOrBuzz = false;
//            if (N % 3 == 0) {
//                System.out.print("Fizz");
//                fizzOrBuzz = true;
//            }
//            if (N % 5 == 0) {
//                System.out.print("Buzz");
//                fizzOrBuzz = true;
//            }
//
//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(String.valueOf(N));
//            }

//            Scanner scanner =new Scanner(System.in);
//            int N = scanner.nextInt();
//            if (N>=2 || N<=20){
//                for(int i=1; i<=10;i++) {
//                    System.out.println(N + " x " + i +" = " + N * i);
//                }
//            }
//            scanner.close();
//            System.out.println("================================");
//            for(int i=0;i<3;i++)
//            {
//                String s1=sc.next();
//                int x=sc.nextInt();
//                //Complete this line
//                //s is for String, n is for new line, d is for double. Must specify varialbes afterwards
//                System.out.printf( "%-15s%03d %n", s1, x);
//            }
//            System.out.println("================================");
        }


