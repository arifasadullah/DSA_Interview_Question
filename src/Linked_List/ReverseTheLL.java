package Linked_List;

public class ReverseTheLL {
    public static Node reverseTheLL(Node head){
        //we take two Node
        //first node is current which points the head;
        Node curr=head;
        //second node is prev which point null at starting
        Node prev=null;
        //iterate the whole LL with help of curr
        while(curr!=null){
            //first create the temp Node to save the curr.next
            // because when link the head node with prev the connection will be lost
            Node temp=curr.next;
            //after storing curr.next ,let's break the node and point to the prev node
            curr.next=prev;
            //after pointing to prev node,update prev node to curr
            prev=curr;
            //update curr to  next node which is temp;
            curr=temp;
        }
        //return prev to reverse
        return prev;
    }
}
