package homework1.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                a++;
            }
        }
        System.out.println("c-փոփոխականից կա " + a);
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') ;
        {
            System.out.println(true);
        }
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 2; i < text.length - 2; i++) {
            System.out.print(text[i]);
        }
        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int b = 0;
        int d = 0;
        b = chars2.length / 2;
        d = chars2.length / 2 - 1;
        System.out.println(b + " " + d);
    }
}