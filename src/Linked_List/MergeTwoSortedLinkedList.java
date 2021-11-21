package Linked_List;

public class MergeTwoSortedLinkedList {
    public static Node merge(Node head1,Node head2){
        Node dummyNode=new Node(0);
        Node curr=dummyNode;
        while(head1 !=null && head2!=null){
            if(head1.data <= head2.data){
                curr.next=head1;
                head1=head1.next;
            }else{
                curr.next=head2;
                head2=head2.next;
            }
            curr=curr.next;
        }
        while(head1!=null){
            curr.next=head1;
            head1=head1.next;
            curr=curr.next;
        }
        while(head2!=null){
            curr.next=head2;
            head2=head2.next;
            curr=curr.next;
        }
        return dummyNode.next;
    }
}
