class Solution {
    public int lengthOfLIS(int[] nums) {
        int p=nums.length;
        int[] t=new int[p];
        for(int i=1;i<p;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(t[j]+1>t[i]){
                        t[i]=t[j]+1;
                    }
                }
            }
        }
        int maxindex=0;
        for(int i=0;i<t.length;i++){
            if(t[i]>t[maxindex]){
                maxindex=i;
            }
        }
        return t[maxindex]+1;
    }
}
