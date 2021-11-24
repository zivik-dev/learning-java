package uwu.zukashix;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 3
        System.out.print("What table do you want?: ");
        int tableOf = inParse.nextInt();

        for (int i = 1; i != 11; i++) {
            System.out.printf("\n%d x %d = %d", tableOf, i, tableOf * i);
        }
    }
}
