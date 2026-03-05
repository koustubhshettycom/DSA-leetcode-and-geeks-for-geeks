class MinStack {
    // use 2 stacks one for general and other for the minimum value and shit
    Stack<Integer> stc;
    Stack<Integer> minstack = new Stack<>();
    

    public MinStack() {
        stc = new Stack<>();
        
        
    }
    
    public void push(int val) {
        stc.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }
        else{
            if(minstack.peek()>= val){
                minstack.push(val);
            }
        }
        return;
        
        
    }
    
    public void pop() {
        int n = stc.pop();
        if(minstack.peek()== n){
            minstack.pop();
        }
        return;
        
    }
    
    public int top() {
        return stc.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */