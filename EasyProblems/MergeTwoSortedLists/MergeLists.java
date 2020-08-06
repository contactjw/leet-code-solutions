package EasyProblems.MergeTwoSortedLists;

class MergeLists {
    ListNode head;

    public void addToTheLast(ListNode node) {
        if (head == null) {
            head = node;
        }
        else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    // Driver Code
    public static void main(String args[]) {

        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new ListNode(5));
        llist1.addToTheLast(new ListNode(10));
        llist1.addToTheLast(new ListNode(15));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new ListNode(2));
        llist2.addToTheLast(new ListNode(3));
        llist2.addToTheLast(new ListNode(20));

        llist1.head = new Solution().mergeTwoLists(llist1.head,
                llist2.head);
        llist1.printList();
    }
}