public class Solution{

    public List<List<Integer>> permute(intp[] nums){
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, new boolean([nums.length]));
    }

    public void helper(List<List<Integer>>res, List<Integer>path, int[]nums, boolean[]isVisited){
        if(path.size == nums.length) {
            res.add(new ArrayList<Integer>(path));
        }

        for(int i=0; i<nums.length; i++) {
            if (isVisited) {
                continue;
            }

            path.add(nums[i]);
            isVisited[i] = true;
            
            helper(res, path, nums, isVisited);

            path.remove(path.size()-1);
            isVisited[i] = false;
        }
        return;
    }
}