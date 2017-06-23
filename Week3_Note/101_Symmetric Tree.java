public boolean isSymmetric(TreeNode root) {
  if (root == null) {
    return false;
  }

  return helper(root.left, root.right);
}

public boolean helper(TreeNode left, TreeNode right) {
  if (left == null || right == null) {
    return false;
  }

  if (left.val != right.val) {
    return false;
  }

  return helper(left.left, right.right) && helper(left.right, right.left);
}
