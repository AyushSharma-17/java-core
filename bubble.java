public class bubble {
    
    public static void main(String[] args) {
       
        int arr[]={64,34,25,12,22,11,90};
        System.out.println("Unsorted array");
        for(int p: arr){
        System.out.print(" "+p);
        }

        int n= arr.length;
        System.out.println("bubble sorting");

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                  if(arr[i]<arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                  }
            }
        }

        System.out.println("sorted array");
        for(int k:arr){
        System.out.print(" "+k);
        }
    }
}
