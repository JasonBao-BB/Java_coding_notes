public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String s: strs) {

            char[] temp = s.toCharArray();

            Arrays.sort(temp);

            String key = String.valueOf(temp);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}