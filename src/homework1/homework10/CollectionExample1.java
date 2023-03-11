package homework1.homework10;

import homework1.employee2.model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("please input 0 for exit ");
            System.out.println("please input 1 for name");
            System.out.println("please input 2 for delete name ");
            names.add("poxos");
            names.add("mardiros");
            names.add("valod");
            names.add("aramayis");
            System.out.print(names + ",");
            System.out.println();
            String nextLine = scanner.nextLine();
            switch (nextLine) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    getByName();
                    break;
                case "2":
                    deleteByName();
                    break;
            }
        }
    }

    private static void deleteByName() {
        String deleteByName = scanner.nextLine();
        if (names.contains(deleteByName)) {
            names.remove(deleteByName);
            System.out.println("Name removed " + names);
        } else {
            System.out.println("Name not found.");

        }
    }

    private static void getByName() {
        String name = scanner.nextLine();
        if (!names.contains(name)) {
            System.out.println(" Employee with " + name + "dose not exist");
        } else {
            System.out.println(name);
        }
    }
}

