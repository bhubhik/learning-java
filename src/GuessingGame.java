import javax.swing.JOptionPane;

//User to guess a random number that has been generated.
public class GuessingGame {
  public static void main(String[] args) {
    String gameName = "Guessing Game";
    int computerNumber = (int) (Math.random() * 20 + 1);
    int userAnswer = 0;
    int count = 1;

    while (userAnswer != computerNumber) {
      String response = JOptionPane.showInputDialog(null, "Enter your guess between 1-20", gameName, 3);

      try {
        userAnswer = Integer.parseInt(response);
        if (userAnswer < 1 || userAnswer > 20) {
          JOptionPane.showMessageDialog(null, "Invalid guess. Number should be between 1 to 20.", gameName, 0);
        } else {
          count++;
          String result = checkGuessedNumber(userAnswer, computerNumber, count);
          JOptionPane.showMessageDialog(null, "" + result, gameName, 1);
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", gameName, 0);
      }
    }
  }

  public static String checkGuessedNumber(int userAnswer, int computerNumber, int count) {
    if (userAnswer == computerNumber) {
      return "Correct!! You guessed the right number.\n Total Guesses: " + count;
    } else if (userAnswer < computerNumber) {
      return "Your guess is low.. Try again. \nTry number: " + count;
    } else {
      return "Your guess is high.. Try again. \nTry number: " + count;
    }
  }
}
