
import java.util.HashSet;

public class longestsubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestLength = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + longestLength);
    }
    public static int lengthOfLongestSubstring(String s){
         
        HashSet<Character> set= new HashSet<>();
        
        char[] arr= s.toCharArray();

        for(char n:arr){
            set.add(n);
        }
        for(char n:set){
            System.out.println(n);
        }
        int m= set.size();
        
        return m;
    }
}
