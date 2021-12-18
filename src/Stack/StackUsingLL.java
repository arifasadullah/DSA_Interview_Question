package Stack;

//we have to create first LinkedListNode class and a constructor for the node
class LinkedListNode{
    int data;
    LinkedListNode next;

    //constructor for the node
    public LinkedListNode(int data){
        this.data=data;
        this.next=null;
    }
}
//stack class using LL
public class StackUsingLL {

    LinkedListNode head;
    int size=0;
    //constructor
    StackUsingLL(){
        this.head=null;
    }
    //push method
    void push(int data){
        //In stack using LL we insert element at head
        LinkedListNode newNode=new LinkedListNode(data);
        //in push we increase the size of stack by 1;
        size+=1;
        //we point the newNode.next -> head
        newNode.next=head;
        //And make the newNode as head
        head=newNode;
    }
    //pop method
    int pop(){
        //check stack is empty or not
          if(isEmpty()){
              System.out.println("Stack is Empty");
              return -1;
          }else {
              //we also pop element from head
              //first we save the head in a node
              LinkedListNode toBeReturn=head;
              // the point the head to the next node
              head=head.next;
              //we decrease size by 1
              size -=1;
              //return the saved head
              return toBeReturn.data;
          }
    }
//peek method
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else {
           return head.data;
        }
    }

    //stack is empty OR not
    boolean isEmpty(){
       return head==null;
    }
    // for size of stack
    int size(){

        return this.size;
    }

//main function
    public static void main(String[] args) {
        StackUsingLL stack=new StackUsingLL();
        stack.push(45);
        stack.push(35);
        stack.push(25);
        stack.push(15);
        stack.push(5);
        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
    }
}
