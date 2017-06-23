public int kthLargest(TreeNode root, int k) {
  if (root == null) {
    return -1;
  }
  Deque<Integer> stack = new ArrayDeque<>();

  while(root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.addFirst(root);
        root = root.right;
      } else {
        root = stack.removeFirst();
        k--;
        if (k == 0) {
          return root.val;
        }
        root = root.left;
      }
  }
}
