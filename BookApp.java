import java.util.List;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDAO dao = new BookDAO();

        while (true) {
            System.out.println("\n=== Book Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    Book book = new Book(title, author);
                    dao.addBook(book);
                    break;

                case 2:
                    List<Book> books = dao.getAllBooks();
                    System.out.println("\nBook List:");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
