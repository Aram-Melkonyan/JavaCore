package chapter4;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i հավասար է զրոի ");
                    break;
                case 1:
                    System.out.println("i հավասար է մեկի ");
                    break;
                case 2:
                    System.out.println("i հավասար է երկուսի");
                    break;
                case 3:
                    System.out.println("i հավասար է Երեքի ");
                    break;
                default:
                    System.out.println("i մեծ է Երեքից");
            }
        }
    }
}
