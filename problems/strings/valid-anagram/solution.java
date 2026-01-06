import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapInsertion(s.charAt(i), sMap);
            mapInsertion(t.charAt(i), tMap);
        }

        for (char key : sMap.keySet()) {
            if (!sMap.get(key).equals(tMap.get(key))) {
                return false;
            }
        }

        return true;
    }

    public void mapInsertion(char ch, HashMap<Character, Integer> map) {
        Integer count = map.getOrDefault(ch, 0);
        map.put(ch, count + 1);
    }
}
