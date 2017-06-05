/**
Total Accepted: 166490
Total Submissions: 436984
Difficulty: Easy
Contributor: LeetCode
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
**/


public class Solution {
    public int[] plusOne(int[] digits) {

        if (digits.length == 0) {
          return 0;
        }

        int length = digits.length - 1;

        for (int i=length; i >= 0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }

        }

        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}
