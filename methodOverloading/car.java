package methodOverloading;

public class car extends Vehicle {
    public static void main(String[] args) {
        car obj = new car();
        obj.start();
        obj.wheels = 4;
        System.out.println("Car has " + obj.wheels + " wheels");
    }
}
