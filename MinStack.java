class MinStack {
    Stack<Integer> imp = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        imp.push(x);
        if(min == null){    //this condition is important
            min.push(x);
        }else {if(x < min.peek()){
                min.push(x);
                }else min.push(min.peek());
        }
        
    }

    public void pop() {
        imp.pop();
        min.pop();
    }

    public int top() {
        return imp.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
