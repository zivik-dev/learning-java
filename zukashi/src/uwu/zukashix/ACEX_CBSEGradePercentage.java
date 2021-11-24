package uwu.zukashix;

import java.util.Scanner;

public class ACEX_CBSEGradePercentage{
    public static float[] getPercentage() {
        Scanner inputParser = new Scanner(System.in);
        System.out.println("Please give your grades to calculate percentage!");

        System.out.print("\nEnter Marks of English: ");
        float english = inputParser.nextFloat();

        System.out.print("\nEnter Marks of Hindi: ");
        float hindi = inputParser.nextFloat();

        System.out.print("\nEnter Marks of Maths: ");
        float maths = inputParser.nextFloat();

        System.out.print("\nEnter Marks of SST: ");
        float sst = inputParser.nextFloat();

        System.out.print("\nEnter Marks of Science: ");
        float science = inputParser.nextFloat();

        float total_percentage = ((english + hindi + maths + sst + science)/500) * 100;
        float[] retThis = {total_percentage, english, hindi, maths, sst, science};
        return retThis;
    }
}