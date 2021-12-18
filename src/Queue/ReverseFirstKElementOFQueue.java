package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementOFQueue {

    public static void reverseFirstKElement(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<k;i++){
            st.push(q.peek());
            q.remove();
        }
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }

        for(int i=0;i<q.size()-k;i++){
            q.add(q.peek());
            q.remove();
        }

    }
    public static  void print(Queue<Integer> q){
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }


    public static void main(String[] args) {
        System.out.println("Reverse First K Element Of Queue ");
        Queue<Integer> q = new LinkedList<Integer>();

//        queue = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        //50 40 30 20 10 60 70 80 90 100


        int k = 2;
        reverseFirstKElement(q,k);
        print(q);
    }
}
