public void inorder(TreeNode node) {

  if (node == null) {
    return;
  }

  if (node != null) {
    inorder(node.left);
    System.out.println(node.val);
    inorder(node.right);
  }

}

public void inorder(TreeNode node) {
  if (node == null) {
    return;
  }
  Deque<Integer> stack = new Deque<>();

  while(node != null || !stack.empty()){
    if (node != null) {
      stack.addFirst(node);
      node = node.left;
    } else {
      node = stack.removeFirst();
      System.out.print(node.val);
      node = node.right;
    }
  }


}

while (node != null || !stack.empty()) {

  //将所有做字数存入stack
  if (node != null) {
    stack.push(node);
    node = node.left;
  } else {
    //如过拿完
    node = stack.pop();
    System.out.println(node);
    node = node.right;
  }
}
