package LinkedList;



public class LinkedList {

 
        Node head;

        static class Node{
    
            int data;
            Node next;
    
            Node(int value){
                data = value;
            }
        }


        public void printList(){
            Node n = head;
            
            while(n!=null){
                System.out.println(n.data);
                n = n.next;
            }
        }

         //T.c O(1)
        // insert at start that is making it head
        public void push(int data){

            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        //T.c O(1)
        public void insertAfter(Node previousNode, int data){
           
            if(previousNode!=null){
                Node newNode = new Node(data);
                newNode.next = previousNode.next;
                previousNode.next = newNode;     
            }else{
                System.out.println("Previous Node is invalid");
            }
        }


        //T.c O(N)
        public void append(int data){
            Node newNode = new Node(data);

            // check if list is empty and make it first node
            if(head == null){
                head = newNode;
                return;
            }


            // new node going to be last node now
            newNode.next = null;

            //transverse till last node;
            Node lastNode = head;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }


        public void deleteNode(int key){
            
            //store head node
            Node temp = head, prevNode = null;

            if(temp!=null && temp.data ==key){
                if(temp.next!=null){
                    head = temp.next;
                }else{
                    head = null;
                }
                
                return;
            }

            // search for the key 
            // no need to check if temp.next is null as temp will become next and null so temp!=null is enough
            while(temp!=null && temp.data!=key ){
                prevNode = temp;
                temp = temp.next;
            }
            
            // means reach end and no key match found
            if(temp==null){
                
                return;
            }    
            else{
                // unlink the node if found
                prevNode.next = temp.next;
            }
            
        }


        public void deleteNodeAt(int position){
           
            // position = position-1; // if position is diff from index;

             // If linked list is empty 
            if (head == null) 
            return; 

            if(position == 0){
                head = head.next;
                return;
            }

             // Find previous node of the node to be deleted 
            Node prevNode = head;
            for(int i =0;prevNode!=null&i<position-1;i++){
                prevNode = prevNode.next;
            }

            // If position is more than number of ndoes 
            if (prevNode == null || prevNode.next == null) 
                return; 

          
            prevNode.next = prevNode.next.next; // we will link the prev node next to next nodes next to unlink middle node;
            


        }
    


    public static void main(String args[]){
       
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        list.head.next = node2;
        node2.next = node3;

       // list.printList();
        list.push(0);
      //  list.printList();

        list.insertAfter(node2, 4);

        list.append(5);

        list.deleteNode(4);

        // here position is same as index
         list.deleteNodeAt(4);

        list.printList();



    }
   

}
