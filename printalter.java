import java.util.ArrayList;

public class printalter {
    
    static ArrayList<Integer> printAlternate(int[] arr){
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0; i<arr.length;i+=2){
            res.add(arr[i]);
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8,9};
        System.out.println("the original array is");
        for(int h:arr){
            System.out.println(h);
        }
        ArrayList<Integer> result= printAlternate(arr);
        System.out.println("the alternate elements are");
        for(Integer num:result){
            System.out.println(num);
        }
    }
}
