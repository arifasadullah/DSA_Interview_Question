package Stack;

public class StackUsingArray {
    int capacity=1000;
    int[] arr=new int[capacity];
    int top;
    public StackUsingArray(){
        top=-1;
    }
    void push(int data){
        if(top>=capacity-1){
            System.out.println("Stack OverFlow");
        }else{
            arr[++top]=data;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack UnderFlow");
            return 0;
        }else{
            return arr[top--];
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack UnderFlow");
            return 0;
        }else{
            return arr[top];
        }
    }
    boolean isEmpty(){
        if(top<0){
            System.out.println("True");
            return true;
        }else{
            System.out.println("False");
            return false;
        }
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);

        stack.pop();
        System.out.println( "peek element -> " + stack.peek());
        stack.isEmpty();
        stack.print();

    }
}
