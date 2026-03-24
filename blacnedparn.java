// make balanced parenthesis :-- how many paranthess should add to make it balanced
// S="())"


public class blacnedparn {
    public static void main(String a[]){
        String S= "(((((((()))))";
        int openbrac=0;
        int closebrac=0;

        for( char ch:S.toCharArray()){
            if(ch=='('){
                openbrac++;
            }
            else{
                closebrac++;
            }
        }
        int ans = openbrac-closebrac;
        if(ans<0){
            System.out.println("need to add open bracket "+(-ans));
        }
        else{
            System.out.println("need to add close bracket"+ans);
        }
    }
}
