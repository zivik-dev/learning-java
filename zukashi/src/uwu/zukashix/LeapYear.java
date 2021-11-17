package uwu.zukashix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 5
        System.out.print("Type a year: ");
        int year = inParse.nextInt();

        if (year % 4 == 0) {
            System.out.printf("\n\n%d is a leap year", year);
        } else {
            System.out.printf("\n\n%d is NOT a leap year", year);
        }
    }
}
