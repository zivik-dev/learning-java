package uwu.zukashix;

import java.util.Scanner;

public class PrintStarPattern {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 1
        System.out.print("How many * do you want to be printed: ");
        int howManyStars = inParse.nextInt();

        for (int i=howManyStars; i!=0; i--) {
            for (int f=i; f!=0; f--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // ExQ 7
        System.out.println("\n\n\n");

        int i = howManyStars;
        int f;

        while (i!=0) {
            f=i;
            while (f!=0) {
                System.out.print("*");
                f--;
            }
            System.out.print("\n");
            i--;
        }
    }
}
