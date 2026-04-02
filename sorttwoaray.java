//two sorted array are given and we have to merge them in sorted order using extra space.

public class sorttwoaray {
    public static void main(String[] args) {
       int [] arr1={1,3,5,7};
         int [] arr2={2,4,6,8};
         // new array lenght defined
            int [] arr3=new int[arr1.length+arr2.length];
            int i=0,j=0,k=0;
            //sorting the two array in sorted order
            while(i<arr1.length&&j<arr2.length){
                if(arr1[i]<arr2[j]){
                    arr3[k++]=arr1[i++];
                }
                else{
                    arr3[k++]=arr2[j++];
                }
            }
            //if any one of the array is left then we will add that in the new array
            while(i<arr1.length){
                arr3[k++]=arr1[i++];
            }
             //if any one of the array is left then we will add that in the new array
            while(j<arr2.length){
                arr3[k++]=arr2[j++];
            }
            //printing array in sorted order
            for(int m:arr3){
                System.out.print(m+" ");
            }

    }
}
