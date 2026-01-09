import java.util.Set;
import java.util.HashSet;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i ++) {
            boolean res = set.add(nums[i]);
            if (res != true) {
                return true;
            }
        }

        return false;
    }
}