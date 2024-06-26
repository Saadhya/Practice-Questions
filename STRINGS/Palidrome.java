package STRINGS;

public class Palidrome {
    public static boolean getPalindrome(String str) {
        int i = 0;
        int n = str.length();
        while (i <= n / 2) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static double shortPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // north
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return Math.sqrt(X2 + Y2);
    }

    public static boolean compare() {
        String s1 = "tony";
        // String s2 = "tony";
        String s3 = new String("tony");

        // checks the objects - s2 is pointing to s1 only
        // if (s1 == s2) {
        //     System.out.println("s1 s2 true");
        //     return true;
        // }
        // if (s1 == s3) {
        //     System.out.println("s1 s3 true");
        //     return true;
        // }

        // checks based on the value of the object
        if (s1.equals(s3)) {
            System.out.println("s1 s3 true");
            return true;
        } else {
            System.out.println("s1 s3 not true");
            return false;
        }
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        // System.out.println(getPalindrome("rapar"));
        // System.out.println(getPalindrome("racear"));
        System.out.println(shortPath(path));

        compare();
    }
}
