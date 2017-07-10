public void bubbleSort(int[] nums) {
    for(int i=0; i < nums.length; i++) {
        for (int j=1; j <  nums.length; i++) {
            if (nums[j-1] > nums[j]) {
                swap(nums, j-1, j);
            }
        }
    }
}