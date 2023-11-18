package com.kkotto.Leetcode75.P238;

public class Kkotto238v3 {
    public static void main(String[] args) {
        printArray(productExceptSelf(new int[]{1, 2, 3, 4}));
        printArray(productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = countProductFromStart(nums);
        int[] right = countProductFromEnd(nums);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    private static int[] countProductFromStart(int[] array) {
        int[] startArray = new int[array.length];
        int previousProduct = 1;
        for (int i = 0; i < array.length; i++) {
            startArray[i] = previousProduct;
            previousProduct *= array[i];
        }
        return startArray;
    }

    private static int[] countProductFromEnd(int[] array) {
        int[] endArray = new int[array.length];
        int previousProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            endArray[i] = previousProduct;
            previousProduct *= array[i];
        }
        return endArray;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
