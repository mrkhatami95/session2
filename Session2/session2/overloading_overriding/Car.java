package session2;

public class Car extends Vehicle {

    String name = "BMW";

    @Override
    void start() {
        System.out.println("BMW IS STARTED!!");
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String fillGas(int capacity){
        return "Gas is filled!" + capacity;
    }

}
