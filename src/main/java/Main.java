public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle(2, "Blue", 1.5f, "Gas");

        Car c = new Car(4, "Green", 2.0f, "gas", "Toyota");

        System.out.println("Vehicle Color: " + v.getColor());
        System.out.println("Vehicle Wheels:" + v.getNumberOfWheels());

        System.out.println();

        c.displayInfo();
        c.honk();
    }
}