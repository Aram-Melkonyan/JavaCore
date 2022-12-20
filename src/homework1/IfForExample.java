package homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 15;
        b = 30;
        for (int i = a; i <= b; i++) {


            if (i == b) {
                System.out.println("max " + i);
            }
        }
        for (int i = a; i <= b; i++) {
            System.out.print(i + ",");
        }

        System.out.println();
        if (a == b) {
            System.out.println("a հավասար է b ին ");
        } else {
            System.out.println("a հավասար չէ b ին ");
        }

        char c = (char) a;
        char f = (char) b;
        System.out.println(c + " , " + f);

    }
}