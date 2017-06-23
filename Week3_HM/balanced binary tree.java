public class Solution {
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        height(root);
        return result;
    }

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (Math.abs(left - right) > 1) {
            this.result = false;
        }

        return Math.max(left, right) + 1;
    }
}
