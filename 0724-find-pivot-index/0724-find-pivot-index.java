class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum=0,left_sum=0;
        for(int ele:nums){
            total_sum+=ele;
        }
        for(int i=0;i<nums.length;i++){
            if(left_sum*2 == total_sum - nums[i]){
                return i;
            }
            left_sum+=nums[i];
        }
        return -1;
    }
}