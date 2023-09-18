import java.util.Scanner;

public class LibraryInventory {
  private String[] books;
  private int[] quantities;

  public LibraryInventory(int capacity) {
    books = new String[capacity];
    quantities = new int[capacity];
  }

  public void addBook(String bookTitle, int quantity) {
    for (int i = 0; i < books.length; i++) {
      if (books[i] == null) {
        books[i] = bookTitle;
        quantities[i] = quantity;
        System.out.println("Added " + quantity + " copies of " + bookTitle + " to the inventory.");
        return;
      } else if (books[i].equals(bookTitle)) {
        quantities[i] += quantity;
        System.out.println("Added " + quantity + " more copies of " + bookTitle + " to the inventory.");
        return;
      }
    }
    System.out.println("inventory full. Cannot add " + bookTitle + ".");
  }

  public void displayInventory() {
    System.out.println("Library Inventory");
    for (int i = 0; i < books.length; i++) {
      if (books[i] != null) {
        System.out.println(books[i] + " - Quantity: " + quantities[i]);
      }
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the capacity of your Library inventory: ");
    int capacity = scanner.nextInt();

    LibraryInventory library = new LibraryInventory(capacity);

    while (true) {
      System.out.println("\nLibrary Inventory Managemnet");
      System.out.println("1. Add Book");
      System.out.println("2. Display Inventory");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter book title: ");
          scanner.nextLine();
          String bookTitle = scanner.nextLine();
          System.out.print("Enter quantity: ");
          int quantity = scanner.nextInt();
          library.addBook(bookTitle, quantity);
          break;
        case 2:
          library.displayInventory();
          break;
        case 3:
          System.out.println("See you soon!");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }
  }

}