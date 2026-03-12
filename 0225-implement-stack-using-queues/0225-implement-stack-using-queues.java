class MyStack {
    Queue<Integer> qu;
    Queue<Integer> qu1;


    public MyStack() {
        qu = new ArrayDeque<>();
        qu1 = new ArrayDeque<>();
        
    }
    
    public void push(int x) {
        qu1.add(x);

        while(!qu.isEmpty()){
            qu1.add(qu.remove());
        }

        while(!qu1.isEmpty()){
            qu.add(qu1.remove());
        }

        return;
        
    }
    
    public int pop() {
        return qu.remove();
        
    }
    
    public int top() {
        return qu.peek();
        
    }
    
    public boolean empty() {
        return qu.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */