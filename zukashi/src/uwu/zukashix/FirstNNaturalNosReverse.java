package uwu.zukashix;

import java.util.Scanner;

public class FirstNNaturalNosReverse {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 1
        System.out.print("Enter a number and i'll print everything below it: ");
        int userNumber = inParse.nextInt();
        System.out.println("\n\n");

        for (int userNumber2 = userNumber; userNumber2!=0; userNumber2--) {
            System.out.printf("%d ", userNumber2);
            if ((userNumber2 % 10) == 0) {
                System.out.println("\n");
            }
        }
    }
}
