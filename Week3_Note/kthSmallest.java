public class Solution {
  private int counter;
  private int value;

  public int kthSmallest(TreeNode root, int k) {

    this.counter = k;

    if(root == null) {
        return -1;
    }

    helper(root);
    return this.value;
  }

  public void helper(TreeNode root) {
    if(root == null) {
        return -1;
    }

      helper(root.left);
      this.counter--;
      if (this.counter == 0) {
        this.value = root.val;
        return;
      }
      helper(root.right);
      return;
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
