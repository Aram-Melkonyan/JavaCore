package homework1.homewrk5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        int i;
        char[] result = new char[9];
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (i = 1; i < spaceArray.length - 2; i++) {
            result[result.length - 1] = spaceArray[i];
            System.out.print(result[result.length - 1]);
        }
    }
}


