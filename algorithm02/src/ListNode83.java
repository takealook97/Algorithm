public class ListNode83 {
    int val;
    ListNode141 next;

    ListNode83() {
    }

    ListNode83(int val) {
        this.val = val;
    }

    ListNode83(int val, ListNode141 next) {
        this.val = val;
        this.next = next;
    }
}

class LC83 {
    public ListNode141 deleteDuplicates(ListNode141 head) {
        ListNode141 current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}