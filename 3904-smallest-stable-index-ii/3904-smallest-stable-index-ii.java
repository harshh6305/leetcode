class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suf = new int[nums.length];
        suf[n - 1] = nums[n - 1];
        for (int i = n-2 ; i >= 0; i--) {
            suf[i] = Math.min(suf[i+1], nums[i]);
        }
        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, nums[i]);
            if (maxVal - suf[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}