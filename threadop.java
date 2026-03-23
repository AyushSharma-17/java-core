import java.lang.*;
public class threadop {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2 = new B();
              int num= obj1.getPriority();
        obj1.start();
        obj2.start();
        System.out.println(num);
    }
}
 class A extends Thread {
    @Override
    public void run() {
         for(int i=1;i<=100;i++){
            System.out.println("hi");
             try {
                 Thread.sleep(15);
             } catch (InterruptedException ex) {
                 System.out.println(ex);
             }
        }
    }
}
 class B extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try {
                 Thread.sleep(1);
             } catch (InterruptedException ex) {
                 System.out.println(ex);
             }
        }
    }
}