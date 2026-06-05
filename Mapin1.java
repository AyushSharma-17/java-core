import java.util.HashMap;
import java.util.HashSet;

public class Mapin1 {
    public static void main(String[] args){
       

        HashMap<Integer,String> map1= new HashMap<>();
        map1.put(1,"Alice");
        map1.put(2,"Bob");
        map1.put(3,"Charlie");
        map1.put(4,"Bob");

        for(Integer key: map1.keySet()){
            System.out.println("Key: "+ key + ", Value: "+ map1.get(key));
        }

        HashSet<String> set1= new HashSet<>();
        set1.add("Alice");
        set1.add("Bob");
        set1.add("Charlie");
        set1.add("Bob");

        System.out.println("HashSet: " + set1);

    }
}
