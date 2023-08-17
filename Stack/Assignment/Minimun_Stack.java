package Stack.Assignment;

import java.util.Stack;

public class Minimun_Stack {
    Stack<Integer> s = new Stack<>();
    int mini;

    void push(int data) {

        int curr = data;

        if (s.isEmpty()) {

            s.push(data);

            mini = data;

        }

        else if (curr < mini) {

            int temp = 2 * curr - mini;

            s.push(temp);

            mini = data;

        } else {

            s.push(data);

        }

    }

    int pop() {

        if (s.isEmpty()) {

            return -1;

        }

        int curr = s.peek();

        s.pop();

        if (curr < mini) {

            int prevMin = mini;

            int val = 2 * mini - curr;

            mini = val;

            return prevMin;

        } else {

            return curr;

        }

    }

    int top() {

        if (s.isEmpty()) {
            return -1;
        }

        int curr = s.peek();

        if (curr < mini) {

            return mini;

        }

        else {

            return curr;

        }

    }

    boolean isEmpty() {

        return s.isEmpty();

    }

    int getMin() {

        return mini;

    }

}
