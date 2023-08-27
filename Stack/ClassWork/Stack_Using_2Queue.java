import java.util.Stack;

public class Stack_Using_2Queue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public Stack_Using_2Queue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

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

    public int pop() {
        return s1.pop();

    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
