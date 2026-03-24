
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Employee{
    String name;
    int age;
    public Employee(String name , int age){
        this.name= name;
        this.age= age;
    }
}

public class arraylst {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);      
        System.out.println(list1);

        System.out.println(list1.size());
        System.out.println(list1.contains(20));
        System.out.println(list1.get(2));  // this method is not in collection interface so we have use the ArrayList
           
       // iterating using  iterartor
        list1.iterator().forEachRemaining(n -> System.out.println(n));
              
        ArrayList<String> list2= new ArrayList<String>();
        list2.add("Hello");
        list2.add("World"); 
        list2.add("Java");
        list2.add("Programming");
       // Collections.sort(list2);
       // System.out.println(list2);
       // Collections.reverse(list2);
       // System.out.println(list2);

        String [] arr= list2.toArray(new String[0]);
        for(String str :arr){
            System.out.println(str);
        }
               
        ArrayList<String> list3= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list3);

        // arraylist fo custom object eg :-- name , age
        ArrayList<Employee> emplist= new ArrayList<>();
        emplist.add(new Employee("ayush", 34));
        emplist.add(new Employee("sachin", 40));
        emplist.add(new Employee("rohit", 38));
        emplist.add(new Employee("virat", 36));
        for(Employee emp: emplist){
            System.out.println("name: "+emp.name+ "age: "+emp.age);
        }
             Collections.sort(emplist, (e1,e2) -> e1.age - e2.age);
        System.out.println("after sorting by age");
        for(Employee emp: emplist){
            System.out.println("name: "+emp.name+ "age: "+emp.age);
        }

    }
}
