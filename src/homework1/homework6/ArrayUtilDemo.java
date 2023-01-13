package homework1.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {4, 73, 1, 83, 7, 8, 9, 11, 14, 6, 10};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(numbers);
        au.minOfArray(numbers);
        au.evOfArray(numbers);
        au.oddnOfArray(numbers);
        au.enCount(numbers);
        au.oddCount(numbers);
    }
}
