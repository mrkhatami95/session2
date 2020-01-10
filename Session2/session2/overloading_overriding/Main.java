package session2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.fillGas(50);
        new Car("BENZ").fillGas(60);
        new Car("FERRARI").fillGas(90);
    }

}
