class Solution {
    public int[] resultArray(int[] nums) {
       int n=nums.length;
       List<Integer> arr1=new ArrayList<>();
         List<Integer> arr2=new ArrayList<>();
         arr1.add(nums[0]);
         arr2.add(nums[1]);

        for(int i=2;i<n;i++){
          int list=arr1.get(arr1.size()-1);
          int list2=arr2.get(arr2.size()-1);
          if(list>list2){
            arr1.add(nums[i]);
          }
          else{
            arr2.add(nums[i]);
          }
        }
        int[] result=new int[n];
        int idx=0;
       for (int num : arr1) {
            result[idx++] = num;
        }
        for (int num : arr2) {
            result[idx++] = num;
        }
         return result;
       
    }
}