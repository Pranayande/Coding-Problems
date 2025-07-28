class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> pr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!pr.containsKey(nums[i])){
                pr.put(nums[i],i);
            }
            else{
                int prev=pr.get(nums[i]);
                if(Math.abs(prev-i)<=k){
                    return true;
                }
            
            else{
                pr.put(nums[i],i);
            }
            }
        }
        return false;
    }
}
