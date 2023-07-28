
public class TaskOCP {
    public static void main(String[] args) {

        int maxSpeed = 90;

        Car car = new Car(maxSpeed);
        Bus bus = new Bus(maxSpeed);

        System.out.println(new SpeedCalculation().calculateAllowedSpeed(car));
        System.out.println(new SpeedCalculation().calculateAllowedSpeed(bus));

    }
}

class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed();
    }
}

abstract class Vehicle {
    int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;

    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

}

// класс наследник Vehicle
class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (this.maxSpeed * 0.8);
    }

}

// класс наследник Vehicle
class Bus extends Vehicle {

    public Bus(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (this.maxSpeed * 0.6);
    }

}