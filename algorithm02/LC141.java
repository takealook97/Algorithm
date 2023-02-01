package algorithm02;

import java.util.ArrayList;

class ListNode141 {
    int val;
    ListNode141 next;

    ListNode141(int x) {
        val = x;
        next = null;
    }
}

public class LC141 {
    public boolean hasCycle(ListNode141 head) {
        ArrayList<ListNode141> arraylist = new ArrayList<>();
        if (head == null || head.next == null) {
            return false;
        }
        while (true) {
            arraylist.add(head);
            head = head.next;
            if (arraylist.contains(head)) {
                return true;
            }
            if (head.next == null) {
                return false;
            }
        }
    }

}