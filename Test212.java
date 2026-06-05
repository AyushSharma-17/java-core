class Test212{
    public static void main(String[] args){
        int[] arr= {2,3,1,5,9,4,6,8,7};

        int left=0;
        int right= arr.length-1;
        int maxArea=0;

        while(left< right){                                             
            int width= right-left;
            int height = Math.min(arr[left],arr[right]);
            int area= width* height;
            maxArea= Math.max(maxArea, area);



            if(arr[left]<arr[right]){
                left++;

            }else{
                right--;
            }
        }

        System.out.println("Maximum area: "+ maxArea);

    }
}