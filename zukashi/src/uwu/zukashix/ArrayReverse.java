package uwu.zukashix;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] dynArr = {1, 2, 3, 5, 7, 8, 10, 11, 14, 40, 97, 100};

        for (int i = dynArr.length - 1; i != -1; i--) {
            System.out.printf("Element %d: %d\n", i, dynArr[i]);
        }
    }
}
