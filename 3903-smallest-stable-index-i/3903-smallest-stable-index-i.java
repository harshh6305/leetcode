class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] pre=new int[nums.length];

        pre[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            pre[i]=Math.min(pre[i+1],nums[i]);
        }
        int maxVal=0;
        for(int i=0;i<nums.length;i++){
            maxVal=Math.max(maxVal,nums[i]);
            int sub=maxVal-pre[i];
            if(sub<=k){
                return i;
            }
        }
  return -1;
    }

}