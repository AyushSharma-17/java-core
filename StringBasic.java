
import java.util.Scanner;


public class StringBasic {
    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        System.out.println("Enter your second name: ");
       String name2= sc.nextLine();
       char b=name.charAt(3);
         System.out.println("character at 3rd index is: "+b);

       System.out.println("full name is: "+name+" "+name2);
        
       if(name.equals(name2)){
            System.out.println("both name are same");
        }
        else{
            System.out.println("both name are not same");
        }
            
    }
}
