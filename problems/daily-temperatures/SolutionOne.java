import java.util.Stack;

public class SolutionOne {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];

            while (!stack.isEmpty()) {
                int idxToCompare = stack.peek();
                if (currTemp > temperatures[idxToCompare]) {
                    int idx = stack.pop();
                    res[idx] = i - idx;
                } else {
                    break;
                }
            }

            stack.push(i);
        }

        return res;
    }
}
