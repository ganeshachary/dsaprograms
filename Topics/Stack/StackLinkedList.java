package Stack;

public class StackLinkedList {


    Node root;
    Node last;


    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        if(root==null){
            return true;
        }

        return false;
    }

    // as we are implmenting stack new node will always be first or root one.
    public void push(int data){
       
        Node newNode = new Node(data);

        // check if first is null
        if(root==null){
            root = newNode;
            return;
        }else{

        // if first is not null, make this first as stack push is first element

        Node temp = root;
        root = newNode;
        newNode.next = temp;
        }

        System.out.println("Pushed");

    }


    public int peek(){

        if(root!=null){
            return root.data;
        }

        return -1;
    }

    public int pop(){
       
        int value = Integer.MIN_VALUE;
        if(root==null){
           System.out.println("Stack is empty");
           return value;
        }
        
        value = root.data;
        root = root.next;
        System.out.println("Popped "+value);
        return value;

    }


    public void printStack(){

        Node pointer = root;
       
        while(pointer!=null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }



    public static void main(String args[]){

        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
       
       System.out.println(stack.peek());
       
       //stack.pop();
        
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printStack();
      // System.out.println(stack.peek());

    }
    
}
