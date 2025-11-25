public class staticmethod {
    public static void main(String[] args) {
        device1 d1 = new device1();
        d1.brand = "apple";
        d1.name = "iphone";
        d1.modelno = 12;
        d1.show();
        // call by class name only no object calling
        device1.show2();

    }
}

class device1 {
    String brand;
    String name;
    int modelno;

    void show() {
        System.out.println("simple show");
    }

    // sttaic method and only static variables can be used in static method
    static void show2() {
        System.out.println("static show2");
    }
}