package uwu.zukashix;

import java.util.Scanner;

public class KMToMiles {
    public static void main(String[] args) {
        Scanner inParse = new Scanner(System.in);
        System.out.print("Enter a number in KM: ");

        float kilometer = inParse.nextFloat();

        float miles = kilometer / 1.609F;
        System.out.println();
        System.out.println(miles);
    }
}
