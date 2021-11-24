package com.Kiyoshi;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("MARKS OF A STUDENT");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks scored in Maths > ");
        int sub1 = sc.nextInt();
        System.out.println("Marks scored in Science > ");
        int sub2 = sc.nextInt();
        System.out.println("Marks scored in S.S.T > ");
        int sub3 = sc.nextInt();
        System.out.println("Marks scored in Hindi > ");
        int sub4 = sc.nextInt();
        System.out.println("Marks scored in English > ");
        int sub5 = sc.nextInt();
        int percentage = ((sub1+sub2+sub3+sub4+sub5)/500) * 100;
//        int percentage2 = percentage*100;
        System.out.println("THE STUDENT SCORED: ");
        System.out.print(percentage);
        System.out.print('%');
    }
}
