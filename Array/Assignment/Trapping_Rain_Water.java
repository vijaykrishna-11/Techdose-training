package Array.Assignment;

import java.util.Stack;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int total = 0;
        int lm = height[0];
        Stack<Integer> stk = new Stack<>();
        stk.push(height[height.length - 1]);
        for (int i = height.length - 2; i >= 2; i--) {
            int t = Math.max(stk.peek(), height[i]);
            stk.push(t);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(stk.peek(), lm);
            if (min > height[i])
                total += min - height[i];
            lm = Math.max(lm, height[i]);
            stk.pop();

        }
        return total;
    }
}
