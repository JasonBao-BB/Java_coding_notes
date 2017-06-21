//recursion
public void postorder(TreeNode node) {
  if(node == null) {
    return;
  }
  if (node != null) {
    postorder(node.left);
    postorder(node.right);
    System.out.println(node.val);
  }
}
//Iterative
public List<Integer> postorder(TreeNode node) {

  if (node == null) {
    return;
  }

  Deque<Integer> stack1 = new Deque<>();
  Deque<Integer> stack2 = new Deque<>();

  if (node != null) {
      stack1.addFirst(node);

      while(!stack1.empty()) {
        TreeNode temp = stack1.removeFirst();
        stack2.addFirst(temp);

        if(temp.left != null) {
          stack2.addFirst(temp.left);
        }
        if(temp.right != null) {
          stack2.addFirst(temp.right);
        }
      }
  }
  return new ArrayList<Integer>(stack2);
}
