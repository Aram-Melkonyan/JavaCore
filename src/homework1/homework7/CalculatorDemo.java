package homework1.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result;
        result = calculator.plus(50, 50);
        System.out.println("result Plus : " + result);
        result = calculator.minus(400, 150);
        System.out.println("result Minus : " + result);
        result = calculator.multiply(30, 30);
        System.out.println("result Multiply : " + result);
        result = calculator.divide(700, 30);
        System.out.println("result Divide : " + result);
    }
}
