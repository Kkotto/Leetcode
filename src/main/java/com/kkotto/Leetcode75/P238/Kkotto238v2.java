package com.kkotto.Leetcode75.P238;

public class Kkotto238v2 {
    // Not passed by Time limit
    // Not passed by O(n) requirement
    public static void main(String[] args) {
        printArray(productExceptSelf(new int[]{1, 2, 3, 4}));
        printArray(productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int right = 1;
            for (int j = i + 1; j < nums.length; j++) {
                right *= nums[j];
            }
            int left = 1;
            for (int j = 0; j < i; j++) {
                left *= nums[j];
            }
            result[i] = right * left;
        }
        return result;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
