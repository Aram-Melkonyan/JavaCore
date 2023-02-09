package homework1.employee;

import bookTest.Book;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];

    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee arrayLong[] = new Employee[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arrayLong[i] = array[i];
        }
        array = arrayLong;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    public void searchByname(String names) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().contains(names)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println(" Employee " + names + " not found ");

        }
    }

    public void searchByCompony(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(companyName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println(" Employee " + companyName + " not found ");


        }
    }
}