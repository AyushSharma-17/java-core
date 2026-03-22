@FunctionalInterface
interface testA{
    void display();
}

public class funcinterface {
    public static void main(String[] args) {
        testA a= new testA() {
            public void display() {
                System.out.println("this is a functional interface");// dispaly method is implemented here
            }
        };
        a.display(); // calling the display method
    }
}
