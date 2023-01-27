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
        if (index < 0 || index > size - 1) {
            System.out.println(" Սխալ ինդեքս ");
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println(" Սխալ ինդեքս ");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];

        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println(" Սխալ ինդեքս ");
            return;
        }
        array[index] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println(" Սխալ ինդեքս ");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;

        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}