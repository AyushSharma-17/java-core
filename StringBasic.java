
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        String name;
        String name2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        name= sc.nextLine();
        System.out.println("Enter your second name: ");
        name2= sc.nextLine();
        if(name == name2){
            System.out.println("both name are same");
        }
        else{
            System.out.println("both name are not same");
        }
    }
}
