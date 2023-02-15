package test;

import java.util.Stack;

/**
 * @author : xutinghao
 * @date : 2022/3/23 09:02
 * @description :
 */
public class Solution2 {
    public int[] reversePrint(ListNode head) {
        //栈先后出
        Stack<Integer> stack = new Stack<>();
        while(head!= null){
            stack.push(head.val);
            head = head.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] =   stack.pop();
        }
        return nums;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        ListNode m = new ListNode(3);
        ListNode mm = new ListNode(2);
        m.setNext(mm);
        listNode.setNext(m);

        int[] ints = new Solution2().reversePrint(listNode);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
