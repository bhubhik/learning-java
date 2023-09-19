import classes.Car;

public class CreateCar {

  public static Car createCar(String make, String model, int year) {
    Car car = new Car(make, model, year);
    return car;
  }

  public static void main(String[] args) {
    Car newCar = createCar("Nissan", "Maxima", 2011);
    newCar.displayCarInfo();
  }
}
