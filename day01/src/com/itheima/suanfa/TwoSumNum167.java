package com.itheima.suanfa;

/*
    输入：numbers = [2,7,11,15], target = 9
    输出：[1,2]
    解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
* */

import java.util.HashMap;
import java.util.Map;

public class TwoSumNum167 {
    public static int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return  new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] numbers, int target){
         int low = 0, high = numbers.length - 1;
         while (low < high){
             int sum = numbers[low] + numbers[high];
             if(sum == target){
                 return new int[]{low + 1, high + 1};
             }else if(sum > target){
                 high--;
             }else {
                 low++;
             }
         }
         return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res = twoSum2(nums, 9);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
