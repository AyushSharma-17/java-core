
import java.util.Scanner;

class arrayfind{
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60,70,80};
        int find;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to be found:");
        find= sc.nextInt();
        for(int i=0;i<arr.length;i++){
           if(arr[i]==find) 
            { System.out.println("Element found at index: " + i);
             
                break;
            }

        }

        
    }
}