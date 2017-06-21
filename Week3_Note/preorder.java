public void preorder(TreeNode node) {
  //recursion
  if (node != null) {
    System.out.println(node.val);
    preorder(node.left);
    preorder(node.right);
  }
}

//Iterative
public void preorder(TreeNode node) {

  Deque<Integer> stack = new Deque<>();
  if (node != null) {
    stack.addFirst(node);

    while(!stack.empty()) {
        TreeNode temp = stack.removeFirst();
        System.out.println(temp.val);
        if(temp.right != null) {
            stack.addFirst(temp.right);
        }

        if (temp.left != null) {
          stack.addFirst(temp.left);
        }

    }
  }
}
