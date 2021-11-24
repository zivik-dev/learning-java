package uwu.zukashix;

import java.util.Locale;
import java.util.Scanner;

public class StringFuncs {
    public static void main(String[] args) {
        // Important Classes Init
        Scanner inParse = new Scanner(System.in);

        // ExQ 1 (Covert to Lowercase)
        /*
        System.out.print("Enter A String With Uppercase Letters: ");
        String input = inParse.next();
        input = input.toLowerCase();
        System.out.printf("\nLowercase string: %s", input);
        */

        // ExQ 2 (Replace " " to "_")
        /*
        System.out.print("Enter A String With Spaces: ");
        String input2 = inParse.nextLine();
        input2 = input2.replace(" ", "_");
        System.out.printf("\nstring with underscores: %s", input2);
        */

        // ExQ 3 (Replace strings in letter)
        /*
        System.out.print("Enter Your Name: ");
        String input3name = inParse.nextLine();
        String letter = "Dear <|name|>, Thanks a lot";
        String finalOutput = letter.replace("<|name|>", input3name);
        System.out.printf("\nLetter: %s", finalOutput);
         */

    }
}
