import java.util.Scanner;

public class AverageCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your integers separated by space: ");
    int count = 0, sum = 0;

    String input = scanner.nextLine();
    String[] numbers = input.split("\\s+");

    for (String number : numbers) {
      try {
        int num = Integer.parseInt(number);
        sum += num;
        count++;
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
      }
    }

    if (count == 0) {
      System.out.println("No valid integers added.");
    } else {
      double average = (double) sum / count;
      System.out.println("The average is " + average);
    }
    scanner.close();
  }
}