package Stack;

public class StackUsingArrays {

    private int top;
    private final int MAX  = 1000;
    private int stack[] = new int[MAX];

    StackUsingArrays(){
        top = -1;
    }

    public void push(int data){
        
        if(top==MAX-1){
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = data; 
    }


    public int pop(){

        if(!isEmpty()){
            int value = stack[top];
            top--;
            return value;
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public int peek(){
        
        if(top!=-1){
            return stack[top];  
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty(){
       
        if(top==-1)
            return true;
        
        return false;
    }


    public void printStack(){
        int size = top;
        while(size>=0){
            System.out.println(stack[size]);
            size--;
        }
    }

    


    public static void main(String args[]){

            StackUsingArrays stack = new StackUsingArrays();
            stack.push(1);
           
           // System.out.println(stack.peek());
           
            System.out.println(stack.pop());
            
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.printStack();
          // System.out.println(stack.peek());

    }
    
}


