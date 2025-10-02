public class basicprobelmarray {
    public static void main(String[] args) {
        int arr[]={12,23,34,45,56};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of array is "+sum);

       // to find the largest element in array
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        System.out.println("the largest element in array is "+largest);



        //to find the smallest element in array

                 int smallest=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<smallest){
            smallest=arr[i];
        }
    }
    System.out.println("the smallest element in array is "+smallest);
    }
    
}
