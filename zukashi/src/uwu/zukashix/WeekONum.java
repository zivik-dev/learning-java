package uwu.zukashix;

import java.util.Scanner;

public class WeekONum {
    public static void main(String[] args) {
        // Init Scanner
        Scanner inParse = new Scanner(System.in);

        // ExQ 4
        System.out.print("Enter a number: ");
        int dayoweek = inParse.nextInt();

        System.out.print("\n\nToday is this day according to you: ");
        switch(dayoweek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown.");
                break;
        }
    }
}
