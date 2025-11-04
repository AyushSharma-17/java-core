import java.util.ArrayList;
import java.util.HashSet;

public class arrayunq {

    public ArrayList<Integer> uniqueArray(int[] arr, int n) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!seen.contains(arr[i])) {
                seen.add(arr[i]);
                uniqueList.add(arr[i]);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,7,4,6,9,9,2,5,1};
        int n= arr.length;
        System.out.println("the original array is");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            
        }
        System.out.println("the unique array is");
        arrayunq obj = new arrayunq();
        ArrayList<Integer> result = obj.uniqueArray(arr, n);
        for (Integer num : result) {
            System.out.println(num);
        }
    }

}
