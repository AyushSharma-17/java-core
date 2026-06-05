
import java.util.HashSet;

public class Hset2 {
    public static void main(String[] args){

        int arr[]= {2,3,4,2,5,6,7,8,10,9,10};

        HashSet<Integer> set1 = new HashSet<>();
        for(int i:arr){
            System.out.println(i);
        }

        for(int i=0;i<arr.length;i++){
            set1.add(arr[i]);
        }

        System.out.println(set1);
    }
}
