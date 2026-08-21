class Solution {
    public int[] twoSum(int[] nums, int target) {
        int slow=0;
        int fast=nums.length-1;
       while(slow<fast){
        int sum=nums[slow]+nums[fast];
        if(sum==target){
            return new int[]{slow+1,fast+1};
        } if(sum>target){
            fast--;
        }else{
            slow++;
        }
       }
        return new int[]{slow,fast};
      
    }
}