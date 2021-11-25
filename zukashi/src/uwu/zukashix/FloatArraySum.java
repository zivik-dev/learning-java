package uwu.zukashix;

import java.util.Scanner;

public class FloatArraySum {
    public static void main(String[] args) {
        // Init
        Scanner inParse = new Scanner(System.in);
        float[] sumArray = new float[5];
        float sumOfArray = 0.0F;

        // ExQ 1
        for (int i = 0; i != 5; i++) {
            System.out.printf("\nEnter a float for index %d: ", i);
            sumArray[i] = inParse.nextFloat();
        } for (float flt: sumArray) {
            sumOfArray += flt;
        }

        System.out.printf("\nThe sum is %f", sumOfArray);
    }
}
