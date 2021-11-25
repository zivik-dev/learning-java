package uwu.zukashix;

public class FindArrayMean {
    public static void main(String[] args) {
        // Init
        int[] physMarks = {64,97,46,85,35,75,35,86,24,86,26,86,34,86};
        int sumOfMarks = 0;
        int lengthOfArray = physMarks.length;

        // ExQ 3
        for(int marks: physMarks) {
            sumOfMarks += marks;
        }

        System.out.printf("The average marks is: %f", (float) sumOfMarks / lengthOfArray);
    }
}
