package uwu.zukashix;

import java.util.Scanner;

public class GradeEncrypt {
    public static void main(String[] args) {
        Scanner inParse = new Scanner(System.in);
        System.out.print("Enter Grade:");
        int grade = inParse.nextInt();

        System.out.println("Encrypting Grade");
        grade = grade + 8;
        System.out.print("Encrypted Grade = ");
        System.out.print(grade);

        System.out.println("\nDecrypting Grade");
        grade = grade - 8;
        System.out.print("Decrypted Grade = ");
        System.out.print(grade);
    }
}
