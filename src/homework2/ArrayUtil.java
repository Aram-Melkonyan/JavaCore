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
        System.out.print("Զույգերի քանակը = " + a);
        System.out.println();
        System.out.print("Կենտ թվեր ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                b++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Կենտ թվերի քանակը = " + b);
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            c += numbers[i];
        }
        System.out.println("մասիվի էլեմենտների գումարը = " + c);
        System.out.println("մասիվի բոլոր թվերի միջին թվաբանականը = " + c / numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers.length - 1);
    }
}













