import java.util.Scanner;

public class OddOrEven {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter a number (or 'exit' to quit): ");
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Bye Bye!");
        break;
      }

      try {
        int number = Integer.parseInt(input);
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is an " + result + " number.");
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please try again.");
      }
    }
    scanner.close();
  }
}
