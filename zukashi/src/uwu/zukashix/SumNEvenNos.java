package uwu.zukashix;

import java.util.Scanner;

public class SumNEvenNos {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 2
        System.out.print("Enter the value of N: ");
        int n = inParse.nextInt();

        int sum = n*(n+1);
        System.out.printf("\nThe sum of all first %d numbers is: %d", n, sum);
    }
}
