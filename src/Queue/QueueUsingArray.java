package Queue;

//Queue using arrays
public class QueueUsingArray {
    int capacity,front,rear,size;
    int[] queueArr;
//    int size;

//queue constructor
    QueueUsingArray(int c){
        capacity=c;
        queueArr=new int[capacity];
        front=rear=size=0;
//        rear=0;
//        size=0;
    }

    //enqueue method(push)
    void enqueue(int data){
        //if queue is full
          if(size==capacity){
              System.out.println("Queue is full");
          }else{
              queueArr[rear%capacity]=data;
              size++;
              rear++;

          }
    }
    //pop
    void dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
             }else{
            queueArr[front%capacity]=-1;
            front++;
            size--;
        }
    }
  int queueFront(){
      if(size==0){
          System.out.println("Queue is empty");
          return 0;
      }else{
          return queueArr[front%capacity];
      }
  }
     void queueDisplay() {
        if (front == rear) {
            System.out.println("Queue is Empty");
        }
        // traverse front to rear and print elements
        for (int i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queueArr[i%capacity]);
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue=new QueueUsingArray(5);
        queue.enqueue(59);
        queue.enqueue(5);
        queue.enqueue(55);
        queue.enqueue(52);
        queue.enqueue(50);
        queue.queueDisplay();
        System.out.println();
        queue.dequeue();
        queue.queueDisplay();
        System.out.println();
        queue.enqueue(500);
        queue.dequeue();
        queue.enqueue(222);
        queue.enqueue(55);
        queue.queueDisplay();
    }
}
