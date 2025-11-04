import java.util.ArrayList;

public class testlist {
    public static void main(String[] args) {
        System.out.println("this is test list file");

        ArrayList<Integer> List1= new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3); 
        List1.add(4);
        List1.add(5);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        List1.add(9);
        System.out.println("the elements in arraylist are");
        for(Integer num :List1)
        {
            System.out.println(num);
        }
        Integer val= List1.getFirst();
        System.out.println("the first element is "+val);
        Integer val2= List1.getLast();
        System.out.println("the last element of arraylist is "+val2);
    }
}
