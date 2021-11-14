package uwu.zukashix;

public class QuickTests {
    public static void main(String[] args) {
        // change string values
        String str1 = "Hullo";
        str1 = "Hello";
        System.out.println(str1);

        System.out.println("PART 2");

        // change references
        String str2 = "Rule";
        String str3 = "Rule";
        System.out.println(str2 == str3);
        str2 = "Rules";
        System.out.println(str2 == str3);
    }
}
