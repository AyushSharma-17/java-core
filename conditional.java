import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("enter the value of x");
        int x= scn.nextInt();
        System.out.println("enter the value of y");
        int y= scn.nextInt();
        if(x>y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
    }
}
