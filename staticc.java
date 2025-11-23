public class staticc {
    public static void main(String[] args) {
        device d1 = new device();
        device.brand = "apple"; // static variable in other class can be called by class name (best way)
        d1.name = "iphone";
        d1.modelno = 12;
        d1.show();
    }

}

class device {
    static String brand; // instance variable and static variable this is class variable not the object
                         // variable
    String name; // instance variable
    int modelno; // instance variable

    void show() {
        System.out.println(brand + " " + name + " " + modelno);
    }

}
