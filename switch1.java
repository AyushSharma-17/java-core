import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        System.out.println("enter the day number");
        int day;
        String h="Hello";
        Scanner sc= new Scanner(System.in);
        day= sc.nextInt();
        switch(h){
            case "Hello":
            System.out.println("monday");
            break;
            
            default:
            System.out.println("invalid day number");
        }
    }

    
}
