import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> wrapperArray = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            wrapperArray.add(Integer.valueOf(nums[i]));
        }

        Set<Integer> set = new HashSet<>(wrapperArray);
        return set.size() != wrapperArray.size();
    }
}
