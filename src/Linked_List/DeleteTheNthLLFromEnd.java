package Linked_List;

public class DeleteTheNthLLFromEnd {
    public static  Node  deleteTheNthLLFromEnd(Node head,int k){
        Node start=new Node(0);
        start.next=head;
        Node fast=start;
        Node slow=start;
        for(int i=1;i<=k;++i) {
            fast = fast.next;
        }
            while(fast.next !=null ){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;

        return start.next;
    }
}
