package Linked_List;

public class UseOfLL {
        public static void main(String[] args) {
            Node head1=LinkedListMethods.takeInput();
            Node head2=LinkedListMethods.takeInput();
            Node newll=MergeTwoSortedLinkedList.merge(head1,head2);
//            Node delete=DeleteTheNthLLFromEnd.deleteTheNthLLFromEnd(head,5);
//            Node r=ReverseTheLL.reverseTheLL(delete);
//            Node middle=MiddleElement.getMiddleElement(head);
//            System.out.println(middle.data);
            LinkedListMethods.print(newll);
//            boolean palindrome=PalindromeLL.ispalindrome(head);
        }

}
