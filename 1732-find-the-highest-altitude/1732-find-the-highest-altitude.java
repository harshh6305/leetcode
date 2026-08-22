class Solution {
    public int largestAltitude(int[] nums) {
        int maximum=0;
        int[] prefix=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
       for(int i=0;i<prefix.length;i++){
        maximum=Math.max(maximum,prefix[i]);
       }
       return maximum;
    }
    
}