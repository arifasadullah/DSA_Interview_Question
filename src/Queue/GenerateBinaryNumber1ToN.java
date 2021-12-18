package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber1ToN {
    public static String [] generateBinaryNumber(int n){
        Queue <String> q=new LinkedList<>();
        String [] result =new String[n];
        q.offer("1");
        for(int i=0;i<n;i++){
            result[i]=q.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
    public static void printArray(String [] arr){
        for(String el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Generate Binary Number From 1 to " + n);
        printArray(generateBinaryNumber(n));
    }
}
