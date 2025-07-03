import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) { 
            char current = s.charAt(i);
            if (!st.isEmpty()) {
                char top = st.peek();
                if (isPair(top, current)) {
                    st.pop(); 
                    continue;
                }
            }
            st.push(current); 
        }
        return st.isEmpty();
    }

    public boolean isPair(char left, char right) {
        return (left == '(' && right == ')') ||
               (left == '[' && right == ']') ||
               (left == '{' && right == '}'); 
    }
}
