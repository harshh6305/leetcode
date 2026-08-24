class Solution {
    public int[] sortArray(int[] nums) {
        QuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void QuickSort(int[] nums, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(nums, start, end);
            QuickSort(nums, pivotIndex + 1, end);
            QuickSort(nums, start, pivotIndex - 1);
        }
    }

    public int partition(int[] nums, int start, int end) {

        Random random = new Random();

        int pivotIndex = start + random.nextInt(end - start + 1);
        swap(nums, pivotIndex, end);

        int pivot = end;
        int index = start - 1;
        for (int i = start; i < end; i++) {
            if (nums[pivot] > nums[i]) {
                index++;
                swap(nums, index, i);
            }

        }
        index++;
        swap(nums, pivot, index);
        return index;
    }

    public void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}