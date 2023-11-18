package com.kkotto.Leetcode75.P238;

public class Kkotto238v1 {
    // Not passed by Time limit
    // Not passed by O(n) requirement
    public static void main(String[] args) {
        printArray(productExceptSelf(new int[]{1, 2, 3, 4}));
        printArray(productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            nums = swapElementsFirstElementAndCurrent(nums, i);
            for (int j = 1; j < nums.length; j++) {
                product *= nums[j];
            }
            nums = swapElementsFirstElementAndCurrent(nums, i);
            result[i] = product;
        }
        return result;
    }

    private static int[] swapElementsFirstElementAndCurrent(int[] array, int indexSecond) {
        int temp = array[0];
        array[0] = array[indexSecond];
        array[indexSecond] = temp;
        return array;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
