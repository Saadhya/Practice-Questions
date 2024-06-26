package STRINGS;

public class SubString {
    public static String findSubstr(String str, int start, int end) {
        String res = "";
        // endindex- excluding ending index
        while (start < end) {
            res += str.charAt(start);
            start++;
        }
        return res;
    }
    // public static String largeString(String str, int start, int end) {
    // String res = "";
    // // endindex- excluding ending index
    // while (start < end) {
    // res += str.charAt(start);
    // start++;
    // }
    // return res;
    // }

    public static void main(String[] args) {
        String str = "Helloworld";

        // inbuild function - string.substring(s, e)
        // System.out.println(str.substring(0, 5));
        System.out.println(findSubstr(str, 1, 5));

        String fruits[] = { "apple", "kiwi", "mango", " ", "banana" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("largest string "+ largest);
    }
}
