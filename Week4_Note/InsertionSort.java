public void insertionSort(int[] nums){
    for(int i=0; i<nums.length; i++) {
        for(int j=i; j>0; j++) {
            if (arr[j] < arr[j-1]){
                swap(nums, j, j-1);
            }
        }
    }
}