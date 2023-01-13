package homework1.homework6;

public class ArrayUtil {
    void maxOfArray(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }

    void minOfArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }

    void evOfArray(int[] numbers) {
        System.out.print("Զույգ թվեր : ");
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    void oddnOfArray(int[] numbers) {
        System.out.print("Կենտ թվեր ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    void enCount(int[] numbers) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print("Զույգերի քանակը = " + a);
        System.out.println();
    }

    void oddCount(int[] numbers) {
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                b++;
            }
        }
        System.out.println("Կենտ թվերի քանակը = " + b);
    }
}