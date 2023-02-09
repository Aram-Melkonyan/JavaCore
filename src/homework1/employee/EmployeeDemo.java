package homework1.employee;

import bookTest.Book;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for printing all employee");
            System.out.println("Please input 3 for  search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee ID  ");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input for company");
                    String company = scanner.nextLine();
                    Employee employee = new Employee();
                    employeeStorage.add(employee);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID ");
                    String names = scanner.nextLine();
                    employeeStorage.searchByname(names);
                    break;
                case "4":
                    System.out.println("Please input for company");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompony(companyName);
                    break;
                default:
                    System.out.println(" wrong command please try again ");
            }
        }
    }
}