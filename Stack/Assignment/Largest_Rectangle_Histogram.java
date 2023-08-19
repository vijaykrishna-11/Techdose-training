package Stack.Assignment;

import java.util.Stack;

public class Largest_Rectangle_Histogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int left[] = new int[heights.length], right[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                left[i] = 0;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.pop();
                left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.push(i);

            }
        }
        stack.clear();
        for (int i = heights.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                right[i] = heights.length - 1;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                    stack.pop();
                right[i] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
                stack.push(i);

            }
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (right[i] - left[i] + 1));
        }
        return max;
    }
}
