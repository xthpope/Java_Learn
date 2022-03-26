package test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : xutinghao
 * @date : 2022/3/26 09:36
 * @description :
 */
public class Solution6 {

    /**
     * 统计一个数字在排序数组中出现的次数。
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int num = 0;
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(target < nums[0] || target > nums[nums.length-1]){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]){
                num ++;
            }
            if(target < nums[i]){
                break;
            }
        }
        return num;
    }

    /**
     * 统计一个数字在排序数组中出现的次数。
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0;
        int j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i;
        // 若数组中无 target ，则提前返回
        if(j >= 0 && nums[j] != target) return 0;
        // 搜索左边界 right
        i = 0; j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;
        return right - left - 1;
    }

    public static void main(String[] args){
        int[] ints = {5,7,8,8,10};
        new Solution6().search1(ints,8);
    }
}
