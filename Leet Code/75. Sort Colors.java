class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int middle=0;
        int end=nums.length-1;
        while(middle<=end){
            switch(nums[middle]){
                case 0:
                swap(nums,start,middle);
                middle++;
                start++;
                break;
                case 1:
                middle++;
                break;
                case 2:
                swap(nums,middle,end);
                end--;
                break;
            }
        }
    }
    private void swap(int[] arr,int temp1,int temp2){
        int pos=arr[temp1];
        arr[temp1]=arr[temp2];
        arr[temp2]=pos;

    }
}
