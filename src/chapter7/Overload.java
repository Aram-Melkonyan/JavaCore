package chapter7;

public class Overload {
    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b :" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a " + a);
        return a * a;
    }

}
