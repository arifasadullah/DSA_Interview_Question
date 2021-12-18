package String;

public class Palindrome_Of_String {
    public static void main(String[] args) {
        System.out.println("Palindrome Of String");
        String str="L1";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String  str){
        String st=str.toLowerCase();
        int i=0,j=st.length()-1;
        while(i<j){
            if(st.charAt(i) != st.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
