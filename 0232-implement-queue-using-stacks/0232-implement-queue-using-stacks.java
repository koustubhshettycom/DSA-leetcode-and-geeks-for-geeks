class MyQueue {
    Stack<Integer> stc;
    Stack<Integer> stc2;

    public MyQueue() {
        stc = new Stack<>();
        stc2 = new Stack<>();
        
    }
    
    public void push(int x) {
        stc.push(x);
        
    }
    
    public int pop() {
        while(!stc.isEmpty()){
            stc2.push(stc.pop());
            
        }
        int remove=stc2.pop();
        while(!stc2.isEmpty()){
            stc.push(stc2.pop());
            
        }
        return remove;
        
    }
    
    public int peek() {
        while(!stc.isEmpty()){
            stc2.push(stc.pop());
            
        }
        int peeked = stc2.peek();
        while(!stc2.isEmpty()){
            stc.push(stc2.pop());
            
        }
        return peeked;

        
    }
    
    public boolean empty() {
        if(stc.isEmpty()){
            return true;
        }
        return false;
        
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