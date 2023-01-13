package chapter6;

public class FigurePainter {
    void figureOne() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureTwo() {
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
    }

    void figureThree() {
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