package Stack;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int [] arr={1, 3, 0, 2, 5};
        previousSmallerElement(arr, arr.length);
    }
    public static void previousSmallerElement(int[] arr,int n){
        //create an empty stack
        Stack<Integer> st=new Stack<>();
        //traverse on whole array
        for(int i=0;i<n;i++){

          //check stack is empty or not
            // if not,then keep removing the top element from stack
            // while the top element is greater than or equal to arr[i]
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                System.out.print("-1"+",");
            }else {
                System.out.print(st.peek()+",");
            }
            st.push(arr[i]);
        }
    }
}
