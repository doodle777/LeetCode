package science.duanxu.leetcode.medium;

import science.duanxu.leetcode.datastruct.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

/**
 * 382. Linked List Random Node
 *
 * @author duanxu
 * @version 1.0
 * MAY THE FORCE BE WITH YOU.
 */
public class Q382_LinkedListRandomNode {
    /**
     * @param head The linked list's head.
     * Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    ListNode head = null;
    Random randomGenerator = null;

    public Q382_LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.randomGenerator = new Random();

    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        ListNode result = null;
        ListNode current = head;

        for (int n = 1; current != null; n++) {
            if (randomGenerator.nextInt(n) == 0) {
                result = current;
            }
            current = current.next;
        }

        return result.val;

    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */