import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
  public static void main(String[] args) {
    List<String> arryaListTasks = new ArrayList<>();
    List<String> linkedListTasks = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("TaskManager menu:");
      System.out.println("1. Add a task");
      System.out.println("2. Remove a task");
      System.out.println("3. List all task");
      System.out.println("4. Exit");
      System.out.println("Enter your choice:");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.println("Enter the task: ");
          String task = scanner.nextLine();
          arryaListTasks.add(task);
          linkedListTasks.add(task);
          System.out.println("Task Added!");
          break;
        case 2:
          System.out.println("Enter the task to remove:");
          String taskToRemove = scanner.nextLine();
          arryaListTasks.remove(taskToRemove);
          linkedListTasks.remove(taskToRemove);
        case 3:
          System.out.println("Tasks (ArrayList):");
          for (String arrayListTask : arryaListTasks) {
            System.out.println(arrayListTask);
          }
          System.out.println("Tasks (LinkedList):");
          for (String linkedListTask : linkedListTasks) {
            System.out.println(linkedListTask);
          }
          break;
        case 4:
          System.out.println("Goodbye!");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please enter a valid option number.");
          break;
      }
    }
  }
}
