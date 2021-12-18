package Queue;

//LinkedList Node
class LinkedListNode{
        int data;
        LinkedListNode next;

//constructor for the node
public LinkedListNode(int data){
        this.data=data;
        this.next=null;
        }
  }
public class QueueUsingLL {
    LinkedListNode front,rear;


        public QueueUsingLL() {
                this.front = null;
                this.rear = null;
        }

        void enqueue(int data){
                LinkedListNode newNode =new LinkedListNode(data);
                if(rear==null){
                     rear=front=newNode;
                     return;
                }
                rear.next=newNode;
                rear=newNode;

        }
        int dequeue(){
                if(front==null){
                        return -1;
                }
                int result= front.data;
                front=front.next;
                return result;
        }

        public static void main(String[] args) {
                QueueUsingLL que=new QueueUsingLL();
                que.enqueue(5);

        }
}
