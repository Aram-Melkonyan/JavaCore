package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        System.out.println("Figure 1");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Figure 2");
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Figure 3");
        System.out.println();
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}