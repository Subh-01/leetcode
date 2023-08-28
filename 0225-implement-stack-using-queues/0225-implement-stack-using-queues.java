class MyStack {
 private Queue<Integer> pq;
    public MyStack() {
        pq=new LinkedList<>();
    }
    
    public void push(int x) {
        pq.add(x);
        for(int i=1;i<pq.size();i++)
            pq.add(pq.poll());
    }
    
    public int pop() {
        return pq.poll();
    }
    
    public int top() {
        return pq.peek();
    }
    
    public boolean empty() {
        return pq.isEmpty();
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