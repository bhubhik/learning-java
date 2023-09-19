public class Car {
  private String make;
  private String model;
  private int year;
  private boolean isRunning;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.isRunning = false;
  }

  public void start() {
    if (!isRunning) {
      isRunning = true;
      System.out.println(make + " " + model + " is started.");
    } else {
      System.out.println(make + " " + model + " is already running.");
    }
  }

  public void stop() {
    if (isRunning) {
      isRunning = false;
      System.out.println(make + " " + model + " is stopped.");
    } else {
      System.out.println(make + " " + model + " is already stopped.");
    }
  }

  public int getYear() {
    return year;
  }
}
