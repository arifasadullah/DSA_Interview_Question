package Stack;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int [] arr={1, 3, 0, 2, 5};
        nextGreaterElement(arr, arr.length);
    }
    public static void nextGreaterElement(int[] arr,int n){
        //create an empty stack
        Stack<Integer> st=new Stack<>();
        int[] outputArr=new int[arr.length];
        //traverse on whole array
        for(int i=n-1;i>=0;i--){

            //check stack is empty or not
            // if not,then keep removing the top element from stack
            // while the top element is smaller than or equal to arr[i]
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.empty()){
                outputArr[i]=-1;

//                    System.out.print("-1"+",");

            }else {
//                    System.out.print(st.peek()+",");
                outputArr[i]=st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] +
                    " --> " + outputArr[i]);
    }
}
