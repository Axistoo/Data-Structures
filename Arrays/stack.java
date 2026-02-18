class mystack{
    private final int[] arr ;
    private final int capacity ;
    private int  top; 
    public mystack(int cap){
        capacity = cap ;
        arr = new int[capacity];
        top= -1;
    }
    void push(int val){
        if(top == capacity-1){
            System.out.println("stack overflow");
            return ;
        }
        arr[++top] = val ;
    }
    int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1 ;
        }
        return arr[top];
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return ;
        }
        System.out.println("poped value is " + arr[top--]);
    }
}

 public class stack{
    public static void main(String[] args) {
        mystack stk = new mystack(10);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        int x = stk.peek();
        if(x!=-1){
        System.out.println(x + " is at the top");
        }  
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
        stk.pop();
    }   
 }