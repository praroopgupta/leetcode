class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        if(stack1.empty())
            front = x;
        stack1.push(x);
    }
    
    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();          
    }
    
    public int peek() {
        if(!stack2.empty())
            return stack2.peek();
        return front;
    }
    
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */