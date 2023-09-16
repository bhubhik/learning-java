
//Java program to find the area of a triangle
import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the lengths of all sides of triangle below.");
    while (true) {
      try {
        int lengthA, lengthB, lengthC;
        System.out.println("Enter first side:");
        lengthA = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second side:");
        lengthB = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter third side: ");
        lengthC = Integer.parseInt(scanner.nextLine());

        if (isValidTriangle(lengthA, lengthB, lengthC)) {
          double area = calcualteTriangleArea(lengthA, lengthB, lengthC);
          System.out.println("The area of your triangle is: " + area);
        } else {
          System.out.println("Area of the triangle does not exist.");
        }

      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number.");
      }
    }
  }

  public static boolean isValidTriangle(int lengthA, int lengthB, int lengthC) {
    return ((lengthA + lengthB) > lengthC && (lengthB + lengthC) > lengthA && (lengthA + lengthC) > lengthA);
  }

  public static double calcualteTriangleArea(int lengthA, int lengthB, int lengthC) {
    double s = (lengthA + lengthB + lengthC) / 2.0;
    return Math.sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC));
  }
}
