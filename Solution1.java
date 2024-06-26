class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode current = head; 

        while (current != null) {
            ListNode nextNode = current.next; 
            current.next = prev; 
            prev = current; 
            current = nextNode; 
        }

        return prev; 
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

 
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original List:");
        solution1.printList(head);
        
        ListNode reversedHead = solution1.reverseList(head);
        
        System.out.println("Reversed List:");
        solution1.printList(reversedHead);
    }
}
