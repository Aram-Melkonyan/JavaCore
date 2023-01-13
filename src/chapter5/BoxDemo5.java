package chapter5;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;
        myboxl.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = myboxl.volume();
        System.out.println("Oбъeм равен " + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
