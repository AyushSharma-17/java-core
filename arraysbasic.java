
import java.util.Scanner;

public class arraysbasic {
    public static void main(String[] args) {
        
        int intArray[]= new int[5];  //declaration and instantiation of array
        //initialization of array
        intArray[0]=12;
        intArray[1]=15;
        intArray[2]=18;
        intArray[3]=20;
        intArray[4]=25;

        System.out.println("the value of array on number 2 position "+intArray[2]);
        System.out.println("the length of array is "+intArray.length);
        System.out.println("enter the lenght of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newArray[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of "+(i+1)+" element");
            newArray[i]=sc.nextInt();
        }
        System.out.println("the elements in array are");
        for(int j=0;j<n;j++){
                   System.out.println(newArray[j]);
        }

        //direct allocation of array
        int marks[]={12,23,43,54,76};
    }
}
