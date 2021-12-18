package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
       String str="[{}]";
       boolean ans=isBalanced(str);
        System.out.println(ans);
    }

    //T.c-->O(N) because  we did in a single traverse
    //S.c -->O(N) because we use extra data structure i.e-stack
    static boolean isBalanced(String s){
        //we use extra stack
        Stack<Character> st=new Stack<Character>();
        //convert string into character array
        for(char currBrack :s.toCharArray()){
            //if any of the bracket is open in nature we push in stack
            if(currBrack=='(' || currBrack=='{' || currBrack=='['){
                st.push(currBrack);
            }else{

                if(st.isEmpty())return false;
                //we store the pop element in variable and compare to the countered element while traversing
                //if they are combination of same type of bracket we continue the process
                //else we return false
                char ch=st.pop();
                if(     (currBrack==')' && ch=='(') ||
                        (currBrack=='}' && ch=='{') ||
                        (currBrack==']' && ch=='[') ){
//                    continue;
                }else{
                    return false;
                }
            }
        }

        //after the process we check stack is empty or not(  eg. "{()"  )
        return st.isEmpty();
    }
}
