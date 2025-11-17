public class findcharinstr {
    public static void main(String[] args) {
        String str= "ayush sharma";
        System.out.println("orginal string "+str);
        char ch= 'a';
        // for finding the first index of the char matched in string
        int index= str.indexOf(ch);
        System.out.println("character "+ch+" found at index "+index);

        //for find the number of occurance of char in string
        int no =charnumber(str,ch);
        System.out.println(no);

        //insert a char at specific place in string
        StringBuilder sb= new StringBuilder("ayush sharma");
        int pos=5;
        char insrtchar='-';
        sb.insert(pos,insrtchar).toString();
        System.out.println(sb);

        //delete a char at specific place in string
        sb.deleteCharAt(pos);
        System.out.println(sb);

        String str2 =str.replace(String.valueOf('a'),"");
        System.out.println(str2);

        str2= str.concat(str2);
        System.out.println(str2);

        //reverse a string
        

    }

    static int charnumber(String str,char c){
           
        int count=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==c){
                count++;
            }
        }

        return count;
    }
}
