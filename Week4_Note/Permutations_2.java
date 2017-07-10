public class Solution{

    public void helper(List<List<Integer>>res, List<Integer>path, boolean[] visited, int nums[]) {

        if(visited[i] || (i != 0 && nums[i] == nums[i-1] && visited[i-1])) {
            continue;
        }
        path.add(nums[i]);
        visited[i] = true;

        helper(res, path, visited, nums);
        path.remove(path.size()-1);
        visited[i] = false;
    }
    return;
}