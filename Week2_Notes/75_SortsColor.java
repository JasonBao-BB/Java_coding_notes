/**
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
**/

public class Solution {

  //题目陷阱： 注意
    public void sortColors(int[] nums) {

      int head = 0;
      int tail = nums.length - 1;

      for (int i = 0; i <= tail; i++) {
        if (nums[i] == 0) {
          swap(nums,i,head);
          head++;
        }

        if (nums[i] == 2) {
          swap(nums, i, tail);
          tail--;
          i--;
        }
      }
    }

    public swap(int[]nums, i, j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
}


public class Solution_2 {
  public void sortColors(int[]nums) {
      int zero = 0;
      int one = 1;
      int two = 2;

      for (int i=0; i<nums.length; i++) {
        if (nums[i] == 0) {
          zero++;
        }

        if (nums[i] == 1) {
          one++;
        }

        if (nums[i] == 2) {
          two++;
        }
      }

      for (int i=0; i<zero; i++) {
        nums[i] = 0;
      }

      for (int i=zero; i<zero + one; i++) {
        nums[i] = 1;
      }

      for (int i=zero+one; i<len; i++) {
        nums[i] = 2;
      }

  }
}
