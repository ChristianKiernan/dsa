import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            int[] freq = new int[26];

            for (char c : str.toCharArray()) {
                freq[c - 'a'] ++;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        ArrayList<List<String>> mapVals = new ArrayList<>(map.values());
        return mapVals;
    }
}