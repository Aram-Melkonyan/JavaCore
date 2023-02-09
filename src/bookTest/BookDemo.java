package bookTest;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for printing all book");
            System.out.println("Please input 3 for  search book by name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input title");
                    String title = scanner.nextLine();
                    System.out.println("Please input price");
                    String price = scanner.nextLine();
                    System.out.println("Please input author name ");
                    String author = scanner.nextLine();
                    Book book = new Book(title, author, Double.parseDouble(price));
                    bookStorage.add(book);
                    System.out.println("book was added");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.searchByName(keyword);
                    break;
                default:
                    System.out.println(" wrong command please try again ");
            }
        }
    }
}
