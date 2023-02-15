package test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * @author : xutinghao
 * @date : 2022/3/21 13:07
 * @description :
 */
public class Solution {

    /**
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if(0 == nums.length){
            return new int[]{};
        }

        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
           if(map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]),i};
           }
           map.put(nums[i],i);
        }
        throw new RuntimeException("么得");
    }

}
