package com.Kiyoshi;
import java.util.Scanner;

public class Chapter2_PracticeSet {
    public static void main(String[] args) {
//        Question1
        System.out.println("FIRST QUESTION");
        int a = 4;
        int b = 17;
        int c =6;
        int sum = a + b+c;
        System.out.println(sum);

//        Question2
        System.out.println("\nSECOND QUESTION");
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 +subject3)/30;
        System.out.println(cgpa);

//        Question 3
        System.out.println("\nTHIRD QUESTION");
        System.out.println("What is your name > ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day!");

//        Question 4
        System.out.println("\nFOURTH QUESTION");
        System.out.println("Enter the distance(in km) > ");
        int kilometer = sc.nextInt();
        float miles = kilometer * 0.62f;
        System.out.println(kilometer + " kilometer in miles is " + miles + " miles");


//        Question 5
        System.out.println("\nFIFTH QUESTION");
        System.out.println("Enter your number > ");
        System.out.println(sc.hasNextInt());
    }
}
