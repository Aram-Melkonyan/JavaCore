package homework2;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9, 11, 14, 6, 10};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == 14) {
                System.out.println("max " + numbers[i]);
            }
            if (numbers[i] == 1) {
                System.out.println("min " + numbers[i]);
            }
        }
    }

}








