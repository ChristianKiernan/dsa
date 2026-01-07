import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            int[] frequency = new int[26];

            for (char ch : str.toCharArray()) {
                frequency[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < frequency.length; i++) {
                sb.append("#");
                sb.append(frequency[i]);
            }

            String key = sb.toString();
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
