
import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name= sc.nextLine();
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("welcome "+name+" and your age is "+age);

    }
}
