public TreeNode invertTree(TreeNode root) {
  if (root == null) {
    return root;
  }

  TreeNode temp = root.right;
  root.left = invertTree(root.left);
  temp.right = invertTree(temp);
  return true;
}
