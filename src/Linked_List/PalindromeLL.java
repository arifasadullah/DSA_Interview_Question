package Linked_List;

public class PalindromeLL {
    public static boolean ispalindrome(Node head){
        if(head==null) return true;
        Node mid=MiddleElement.getMiddleElement(head);
        Node last=ReverseTheLL.reverseTheLL(mid.next);
        Node curr=head;
        while(last!=null){
            if(last.data !=curr.data){
                return false;
            }else{
                curr=curr.next;
                last=last.next;
            }
        }
        return true;
    }
}
