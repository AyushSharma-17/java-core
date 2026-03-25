import java.util.HashMap;
import java.util.Map;

public class mapt {
    public static void main(String[] args) {
        Map<String, Integer> mapp= new HashMap<>();
        mapp.put("one", 1);
        mapp.put("two", 2); 
        mapp.put("three", 3);
        mapp.put(" ",4);
        mapp.put(" ", 5);
        System.out.println(mapp);
    }
}
