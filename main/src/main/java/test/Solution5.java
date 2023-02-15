package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : xutinghao
 * @date : 2022/3/25 08:57
 * @description :
 */
public class Solution5 {

    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        throw new RuntimeException("么得");
    }

    public int findRepeatNumber1(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] ints = {2,3,1,0,2,5,3};
        int repeatNumber = new Solution5().findRepeatNumber1(ints);
        System.out.println(repeatNumber);
    }
}
