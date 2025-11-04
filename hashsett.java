
import java.util.HashSet;

public class hashsett {
    public static void main(String[] args) {
        HashSet<String> set1= new HashSet<>();
        set1.add("apple");
        set1.add("bannana");
        set1.add("apple");  //duplicate value
        set1.add("orange");
        System.out.println("the elemets in set are");
        for(String fruits: set1){
            System.out.println(fruits);
        }

        // unique aelemets using hashset
        int[] arr = {1,1,1,2,2,4,3,5,5,7,6};
        HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set2.add(arr[i]);
        }
        System.out.println("the unique elements in array are");
        for(Integer unq: set2){
            System.out.println(unq);
        }
    }
}
