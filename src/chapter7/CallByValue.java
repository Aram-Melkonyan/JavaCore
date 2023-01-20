package chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15,20);
        int a = 15, b = 20;
        System.out.println("a и Ь до вызова: " + a + " " + b);
        ob.meth(ob);
        System.out.println("a и Ь после вызова: " + a + " " + b);


    }
}
