class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingnumber=1;
        Arrays.sort(nums);
        for(int number:nums){
            if(number>0){
            if(number==missingnumber){
                missingnumber++;
            }
            else if(number>missingnumber){
                break;
            }
            }

        }
        return missingnumber;
    }
}
