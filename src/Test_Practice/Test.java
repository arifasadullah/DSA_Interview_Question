package Test_Practice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("String");
        String str="Arif";
        String ans= test(str);
        System.out.println(ans);
    }
   public static String test(String s){
      String str=s.toLowerCase();
      char [] ch=str.toCharArray();
      int i=0;
      int j=ch.length-1;
         while(i<=j){
             char x=ch[i];
             ch[i]=ch[j];
             ch[j]=x;
             i++;
             j--;
         }
       return new String(ch);
   }
}
