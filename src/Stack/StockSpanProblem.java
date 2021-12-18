package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        System.out.println("Stock span problem");
        int [] arr={100,80,60,70,60,75,85};
        stockSpan(arr, arr.length);
    }
    public static void stockSpan(int[]arr,int n){
        Stack<Integer> st=new Stack<>();
        int [] span =new int[n];
        st.push(0);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+",");
        }

    }
}
