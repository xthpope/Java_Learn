package hot100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Solution1 {

    /** 任务
     给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那两个整数，并返回它们的数组下标。
     你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     你可以按任意顺序返回答案。
     **/

    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                if(nums[j] == target - nums[i]){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if(list.contains(target-list.get(i)) ){
                int j = target - list.get(i);
                int i1 = list.indexOf(j);
                if(i != i1){
                    int[] ints = {i, i1};
                    return ints;
                }
            }
        }
        return null;
    }

    /**
     * 利用hash 把空间复杂度降低到n
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        if (nums.length == 0) {
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("no");
    }

    public static void main(String[] args) {
        int[] arr = {0,4,3,0};
        int target = 0;
        int[] ints = new Solution1().twoSum(arr, target);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
