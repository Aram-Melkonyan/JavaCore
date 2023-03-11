package homework1.homework10;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);
    static Set<String> names = new HashSet<>();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("please input 0 for exit ");
            System.out.println("please input 1 for 5 names");
            System.out.println("please input 2 for print all names ");
            System.out.println("please input 3 for sorted names ");

            String nextLine = scanner.nextLine();
            switch (nextLine) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addName();
                    break;
                case "2":
                    printAllNames();
                    break;
                case "3":
                    sortNames();
                    break;
                default:
            }
        }
    }

    private static void sortNames() {
        Set<String> sortedNames = new TreeSet<>(names);
        System.out.println("Sorted names:");
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }

    private static void printAllNames() {
        Set<String> allNames = new HashSet<>();
        for (String name : names) {
            if (!allNames.add(name)) {
                System.out.println(name);
            }
        }
    }

    private static void addName() {
        String name = scanner.nextLine();
        names.add(name);
    }
}