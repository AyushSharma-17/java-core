
import java.util.Scanner;

public class sort1 {
    void main(){
        System.out.println("hello from main");

        int i;
        System.out.println("define size of array");
        Scanner sc = new Scanner(System.in);
            i= sc.nextInt();
        int arr[]= new int[i];
        System.out.println("enter elemnet of array");
        for(int j=0;j<i;j++){
            arr[j]= sc.nextInt();
        }
        System.out.println("array before sorting");
        for(int j=0;j<i;j++){
            System.out.println(arr[j]);
        }

        //sorting logic
        for(int j=0;j<i-1;j++){
            for(int k=j+1;k<i;k++){
                if(arr[j]>arr[k]){
                    int temp= arr[j];
                    arr[j]= arr[k];
                    arr[k]= temp;
                }
            }
        }

    }
}
