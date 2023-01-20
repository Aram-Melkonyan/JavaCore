package homework1.homework8;

public class DynamicArray {
    private int[] array = new int[10];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int arrayLong[] = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arrayLong[i] = array[i];
        }
        array = arrayLong;

    }


    public int getByIndex(int index) {
        return array[index];

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }
}