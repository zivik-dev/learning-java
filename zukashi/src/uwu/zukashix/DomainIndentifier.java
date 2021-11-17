package uwu.zukashix;

import java.util.Scanner;

public class DomainIndentifier {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 6
        System.out.print("Enter a website URL: ");
        String website = inParse.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("\n It's a .com website");
        } else if (website.endsWith(".in")) {
            System.out.println("\n It's a .in website");
        } else if (website.endsWith(".org")) {
            System.out.println("\n It's a .org website");
        } else {
            System.out.println("\n Could not identify domain");
        }
    }
}
