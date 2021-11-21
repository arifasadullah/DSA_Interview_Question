package Linked_List;

import java.util.Scanner;

public class LinkedListMethods {


        public static Node takeInput(){
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();
            Node head=null;
            Node tail=null;
            while(data !=-1){
                // I have a data so create anode for that
                Node newNode=new Node(data);
                if(head==null){
                    head=newNode;
                    tail=newNode;
                }else{
                    tail.next=newNode;
                    tail=newNode;
                }
                data= sc.nextInt();
            }
            return head;
        }
        public static void print(Node head){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" -> ");
                curr=curr.next;
            }
        }

        public static Node insert(int data){
            Node head=null;
            Node newNode=new Node(data);
            if(head == null){
                newNode.next=head;
                head=newNode;
                return head;
            }
            Node curr=head;
            while (curr !=null){
                curr=curr.next;
            }
            curr.next=newNode;
            return head;
        }

}
