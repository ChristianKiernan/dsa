public class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("\\P{IsAlnum}", "").toLowerCase();
        int pointerOne = 0;
        int pointerTwo = cleaned.length() - 1;

        while (pointerOne < pointerTwo) {
            if (cleaned.charAt(pointerOne) != cleaned.charAt(pointerTwo)) {
                return false;
            } else {
                pointerOne ++; pointerTwo --;
            }
        }

        return true;

    }
}