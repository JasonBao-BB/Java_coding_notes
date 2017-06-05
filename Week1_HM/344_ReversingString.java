public class Solution {
    public String reverseString(String s) {
        char []result = s.toCharArray();

        int last = result.length - 1;
        int start = 0;

        while (start < last) {
            char temp = result[start];
            result[start] = result[last];
            result[last] = temp;
            start++;
            last--;
        }

        return String.valueOf(result);
    }
}
