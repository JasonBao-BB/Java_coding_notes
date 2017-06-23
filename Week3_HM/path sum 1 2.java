//Path sum 1
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if(root.left == null && root.right == null && sum - root.val == 0) return true;


        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}


//Path Sum 2
public class Solution {

  public List<List<Integer>> pathSum(TreeNode root, int sum){
	   List<List<Integer>> result  = new LinkedList<List<Integer>>();
	   List<Integer> currentResult  = new LinkedList<Integer>();
	   pathSum(root,sum,currentResult,result);
	   return result;
 }

  public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
		List<List<Integer>> result) {

        if (root == null) return;

        currentResult.add(new Integer(root.val));

        if (root.left == null && root.right == null && root.val-sum == 0) {
            result.add(new LinkedList(currentResult));
            currentResult.remove(currentResult.size() - 1);
            return;
        } else {
            pathSum(root.left, sum-root.val, currentResult, result);
            pathSum(root.right, sum-root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);
  }
}
