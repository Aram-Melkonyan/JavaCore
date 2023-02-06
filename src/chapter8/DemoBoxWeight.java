package chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight maybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight maybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = maybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + maybox1.weight);
        System.out.println();
        vol = maybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен" + maybox2.weight);
    }
}
