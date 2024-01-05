import java.util.Queue;

class MyStack {
	Queue<Object> q1;
	Queue<Object> q2;
    public MyStack() {
    
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()!=1) {
        	q2.add(q1.poll());
        }
        return (Integer)q1.poll();
    }
    
    public int top() {
    	 while(q1.size()!=1) {
         	q2.add(q1.poll());
         }
         return (Integer)q1.peek();
    }
    
    public boolean empty() {
        return q1.size()==0;
    }
}
//OR
/* Queue<Integer> q =new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */