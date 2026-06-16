import java.util.HashMap;
import java.util.HashSet;

public class arraysumlt {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 5, 4, 8 };
        int res = 9;
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        System.out.println(set);
        for (int i = 0; i < arr.length; i++) {
            int comp = res - arr[i];
            if (set.contains(comp)) {
                System.out.println(arr[i] + " " + comp);
                break;
            }
        }

    }

}
