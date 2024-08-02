package BitManipulation;

public class BitManipulate {
    public static void main(String[] args) {
        // with single & its AND bit manipulation
        System.out.println(5 & 6); // o/p = 4
        // exp: 5= 101, 6=110 so, bit mani=> 100 (4 in decimal)

        // OR bit manipulation
        System.out.println(5 | 6); // o/p = 7
        // exp: 5=101, 6=110 so, bit manip=> 111 (7 in decimal)

         // XOR bit manipulation  = work as for same bits will return 0 and diff bits will return 1
         System.out.println(5 ^ 6); // o/p = 3
         // exp: 5=101, 6=110 so, bit manip=> 011 (3 in decimal)
    }
}
