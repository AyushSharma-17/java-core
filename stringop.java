public class stringop {
    public static void main(String[] args) {
        String  str= "hello world";
        System.out.println("original string "+str);

        String upperStr = str.toUpperCase();
        System.out.println("uppercase string: "+upperStr);
        char[] ch;
        ch = str.toCharArray();
        System.out.println("character array:");
        for(char i:ch){
            System.out.print(i);
        }
        //two strings are equals or not
        String s1= "hello";
        String s2= "hello";
        boolean res= s1.equals(s2);
        System.out.println("string are equals "+res);

        
    }
}
