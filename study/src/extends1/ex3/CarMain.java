package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        System.out.println("----");
        ElectricCar electricCar = new ElectricCar();
        Car car = new Car();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        System.out.println("---");
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        System.out.println("---");
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
