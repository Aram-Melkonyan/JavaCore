package homework2;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nubers = {1, 3, 5, 7, 8, 9, 11, 14, 6, 10};
        System.out.println(nubers.length);
        for (int i = 0; i < nubers.length; i++) {
            System.out.print(nubers[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (nubers[i] == 14) {
                System.out.println("max " + nubers[i]);
            }
            if (nubers[i] == 1) {
                System.out.println("min " + nubers[i]);
            }
        }
    }

}








