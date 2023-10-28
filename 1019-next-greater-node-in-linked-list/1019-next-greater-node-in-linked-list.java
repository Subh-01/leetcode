/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
         Integer[] arr = toArray(head);
    Deque<Integer> stack = new ArrayDeque<>();
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
            result[stack.pop()] = arr[i];
        }
        stack.push(i);
    }
    return result; 
}

private Integer[] toArray(ListNode head) {
    List<Integer> list = new ArrayList<>();
    for (ListNode node = head; node != null; node = node.next) {
        list.add(node.val);
    }
    return list.toArray(new Integer[0]);
    }
}