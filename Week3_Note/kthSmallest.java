public int kthSmallest(TreeNode root, int k) {

  if (root == null) {
    return -1;
  }

  int count = k;
  if (root != null) {
    kthSmallest(root,count);
    count--;
    if(count == 0) {
      return root.val;
    }
    kthSmallest(root, count);
  }
}

public int kthSmallest (TreeNode root, int k) {

  if (root == null) {
    return -1;
  }

  Deque<Integer> stack = new ArrayDeque<>();
  int count = k;

  while(root !=null || !stack.isEmpty()) {

    if (node != null) {
      stack.addFirst(root);
      root = root.left;
    } else {
      root = stack.removeFirst();
      count--;
      if (count == 0) {
        return temp.val;
      }
      root = root.right();
    }

  }
}
