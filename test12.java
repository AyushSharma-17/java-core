import java.util.*;
public class test12 {
    public static void main(String[] args) {
        int a[]= {1,22,22,3,3,4,5};
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
        HashSet<Integer> set1= new HashSet<>();
        for(int i=0;i<a.length;i++){
            set1.add(a[i]);
        }
        System.out.println("the unique elements in array are"+set1);
        //bubble sort
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        System.out.println("the sorted array is:");
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
}
