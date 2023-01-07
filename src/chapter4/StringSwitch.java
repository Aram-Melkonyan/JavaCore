package chapter4;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "Երկուս ";
        switch (str) {
            case "Մեկ":
                System.out.println("Մեկ");
                break;
            case "Երկուս ":
                System.out.println("Երկուս ");
                break;
            case "Երեք":
                System.out.println("Երեք");
                break;
            default:
                System.out.println("Չի համապատասխանում ");
                break;
        }
    }
}
