package String;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Original String");
        String str="Rabia";
        System.out.println(reverse(str));
        System.out.println("String after reversing");
    }
    static String reverse(String s){
       char[] ch=s.toCharArray();
       int i=0,j= ch.length-1;
       while(i<j){
           char x= ch[i];
           ch[i]=ch[j];
           ch[j]=x;
           i++;
           j--;

       }
       return new String(ch);
    }
}
