package com.itheima.suanfa;

public class MoveZeros283 {
    public void moveZeroes1(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void moveZeroes3(int[] nums){
        int n = nums.length, left = 0, right = 0;
        while (right < n){
            if (nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes3(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
