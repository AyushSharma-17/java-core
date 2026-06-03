public class TcsIon1 {
    public static void main(String[] args){
        int [] arr={2,3,4,2,5,9,5,9,9};

        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                     count++;
                System.out.println(arr[i] + " is duplicates" );
               }
                
            }
            
        }


    }
}
