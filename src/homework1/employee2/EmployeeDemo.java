package homework1.employee2;

import homework1.employee2.model.Employee;
import homework1.employee2.storage.EmployeeStorage;
import homework1.employee2.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        employeeStorage.add(new Employee("poxos", "1222", "a444", "junior ", 100, " admin", true, new Date(), DateUtil.stringToDate("12/02/2023")));
        employeeStorage.add(new Employee("mardiros", "1222", "a777", "midl ", 100, " admin", true, new Date(), DateUtil.stringToDate("12/02/2023")));
        employeeStorage.add(new Employee("baxdasar", "1222", "a111", "senior ", 100, " admin", true, new Date(), DateUtil.stringToDate("12/02/2023")));


        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    grtEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name  ");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeById();
                    break;
                case "9":
                    activateEmployeeById();
                    break;
                default:
                    System.out.println("wrong command try again ");
            }
        }
    }

    private static void inactivateEmployeeById() {
        employeeStorage.printByStatus(true);
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("Employee inactivate");
        } else {
            System.out.println("Employee dose not exist");
        }
    }

    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("Please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position change");
        } else {
            System.out.println("Employee dose not exist");
        }
    }

    private static void searchEmployeesBySalaryRange() {
        System.out.println("please input min , max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println(" min salary should be less then max salary ");
        } else employeeStorage.searchBySalaryRange(minSalary, maxSalary);

    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by company");
        System.out.println("Please input 5 for search employee by salary range ");
        System.out.println("Please input 6 for change employee position by id ");
        System.out.println("Please input 7 for print only active employee ");
        System.out.println("Please input 8 for inactivate employee by id ");
        System.out.println("Please input 9 for activate by  employee id  ");


    }

    private static void grtEmployeeById() {
        System.out.println("Please input employee Id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println(" Employee with " + employeeId + "dose not exist");
        } else {
            System.out.println(employee);
        }
    }

    static public void addEmployee() throws ParseException {
        System.out.println("Please input name, surname, employeeId, salary, company, position,dateOfBirthday (15/04/2023) ");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            Date registerDate = new Date();
            Date dateOfBirthday = DateUtil.stringToDate(employeeData[6]);
            Employee newEmployee = new Employee(employeeData[0], employeeData[1], employeeId, employeeData[3],
                    Double.parseDouble(employeeData[4]), employeeData[5], true, registerDate, dateOfBirthday);
            employeeStorage.add(newEmployee);
            System.out.println("Employee was added  ");
        } else {
            System.out.println("employee with " + employeeId + " already exist!!! ");
        }
    }

    private static void activateEmployeeById() {
        employeeStorage.printByStatus(false);
        System.out.println("Please chose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && !employee.isActive()) {
            employee.setActive(true);
            System.out.println("Employee activate");
        } else {
            System.out.println("Employee dose not exists, or employee already active ");
        }
    }
}