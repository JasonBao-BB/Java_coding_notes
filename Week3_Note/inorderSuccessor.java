public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
  if (root == null) {
    return null;
  }

  if (p.val < root.val) {
    int left = inorderSuccessor(root.left, p);
    return left == null ? root : left;
  } else {
    return inorderSuccessor(root.right, p);
  }
}

public TreeNode inorderSuccessor(TreeNode node, TreeNode p) {
  int candidate = null;

  if (root == null || p == null) {
    return candidate;
  }

  while(root != null) {
    if (p.val < root.val) {
      candidate = root.val;
      root = root.left;
    } else {
      root = root.right;
    }
  }

  return candidate;
}
