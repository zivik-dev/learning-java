package uwu.zukashix;

import java.util.Scanner;
import uwu.zukashix.ACEX_CBSEGradePercentage;

public class StringExer {
    public static void main(String[] args) {
        // Init Main Objects
        Scanner inParse = new Scanner(System.in);

        // ExQ 2
        boolean EachSubjectPass = true;
        boolean MainPass = false;

        float[] percentages = ACEX_CBSEGradePercentage.getPercentage();
        System.out.println("Checking overall grades...");
        if (percentages[0] >= 40.0F) {
            MainPass = true;
            System.out.println("You're pass considering your overall grades!");
        } else {
            System.out.println("You failed in terms of overall grades");
        }

        System.out.println("Checking subject-wise grades...");
        for (float percentage : percentages) {
            if (percentage < 33.0F) {
                EachSubjectPass = false;
                System.out.println("You failed in terms of subject-wise grades");
            }
        }

        if (EachSubjectPass && MainPass == true) {
            System.out.println("Congrats, You have totally passed!");
        } else {
            System.out.println("Sorry, but you failed somewhere...");
        }
    }
}
