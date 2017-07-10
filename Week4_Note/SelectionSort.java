public void selectionSort(int[] nums) {
    for (int i=0; i < nums.length; i++) {
        int smallest = nums[i];

        for (int j=1; j < nums.length; j++){
            if (nums[j] < smallest) {
                smallest = j;
            }
        }
        swap(nums, smallest, j);
    }
}