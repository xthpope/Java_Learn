package test;

import java.util.Stack;

/**
 * @author : xutinghao
 * @date : 2022/3/23 15:10
 * @description :
 */
public class Solution3 {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        return  getListNode(stack);
    }

    private ListNode getListNode(Stack<Integer> stack){
        if (stack == null || stack.pop() == null){
            return null;
        }
        ListNode listNode = new ListNode(stack.pop());
        while (stack.pop() != null){
            if(stack.peek() != null){
                ListNode listNode1 = new ListNode(stack.peek());
                listNode.next = listNode1;
            }
        }
        return listNode;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
