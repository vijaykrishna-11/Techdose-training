package Stack.Assignment;

import java.util.Stack;

public class Valid_Parantheses {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        if (s.length() == 1)
            return false;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                sc.push(s.charAt(i));
            } else {
                if (sc.empty())
                    return false;
                if (s.charAt(i) == ')' && sc.peek() != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && sc.peek() != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && sc.peek() != '[') {
                    return false;
                }
                sc.pop();
            }

        }
        if (!sc.empty())
            return false;
        return true;
    }
}
