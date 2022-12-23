package homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {4, 73, 1, 83, 7, 8, 9, 11, 14, 6, 10};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        int max = numbers[0];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("max " + max);
        int min = numbers[0];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min " + min);
    }

}













