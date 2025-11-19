import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sorttest {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        System.out.println("before sorting" +list);

        Collections.sort(list);
        System.out.println("after sorting" +list);
    }
}
