package easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean result = isPalindromeStack(listNode);
        System.out.println("result = " + result);
    }

    public static boolean isPalindromeTwoPointers(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int j = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            j--;
        }
        return true;
    }


    public static boolean isPalindromeStack(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            int poppedInt = stack.pop();
            if (head.val != poppedInt) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
