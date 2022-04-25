class Solution {
    public boolean isValid(String s) {     
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;
                char temp;
                switch(ch) {
                    case ')':
                        temp = stack.pop();
                        if(temp == '{' || temp == '[')
                            return false;
                        break;
                    case '}':
                        temp = stack.pop();
                        if(temp == '(' || temp == '[')
                            return false;
                        break;
                    case ']':
                        temp = stack.pop();
                        if(temp == '{' || temp == '(')
                            return false;
                        break;
                }
            }
        }
        return (stack.isEmpty());
    }
}