package uwu.zukashix;

import java.util.Scanner;

public class FindIntegerArray {
    public static void main(String[] args) {
        // Init
        Scanner inParse = new Scanner(System.in);
        int[] arr = {543,5,35,43,534,5,35,345,34,53446,35,75,6,5,634,54,635,6,547,468,7,56,6,2,221,431,5};
        boolean found = false;
        int foundIndex = -1;

        // ExQ 2
        System.out.print("What number to find in the integer array?: ");
        int find = inParse.nextInt();

        for(int i = 0; i != arr.length; i++) {
            if (arr[i] == find) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            System.out.printf("\nFound %d at index %d.", find, foundIndex);
        } else {
            System.out.printf("Could not find %d in the array.", find);
        }
    }
}
