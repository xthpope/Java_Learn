package test;


/**
 * 9. 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 * @author : xutinghao
 * @date : 2022/3/21 13:35
 * @description :
 */
public class Solution1 {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        String[] split =  String.valueOf(x).split("");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            String s1 = split[split.length - 1 - i];
            if(!split[i].equals(split[split.length-1 - i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 0;
        boolean palindrome = new Solution1().isPalindrome(a);
        System.out.println(palindrome);
    }
}
