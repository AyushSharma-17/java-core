public class oddevenarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evencount=0;
        int oddcount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        int [] evenarr= new int[evencount];
        int [] oddarr= new int[oddcount];
        int evevIndex=0;
        int oddIndex=0;
        for(int num:arr){
            if(num % 2 == 0){
                evenarr[evevIndex++]=num;
            }
            else{
                oddarr[oddIndex++]=num;
            }
        }
                    
        System.out.println("Even numbers:");
        for(int num:evenarr){
            System.out.print(num + " ");

        }
        System.out.println("\nOdd numbers:");
        for(int num:oddarr){
            System.out.print(num +" ");
        }
    }
}