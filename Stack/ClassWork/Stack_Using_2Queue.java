import java.util.Stack;

public class Stack_Using_2Queue {
    /** Initialize your data structure here. */
    Stack<Integer> s1;// stack 1
    Stack<Integer> s2;// stack2

    public Stack_Using_2Queue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);

        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s1.pop();

    }

    /** Get the front element. */
    public int peek() {
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}
