package com.kkotto.Leetcode75.P334;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Kkotto334 {

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        System.out.println(increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        System.out.println(increasingTriplet(new int[]{1, 5, 0, 4, 1, 3}));
    }

    public static boolean increasingTriplet(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        map = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        List<Integer> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());
        for (int i = 1; i < values.size() - 1; i++) {
            if (values.get(i - 1) < values.get(i) && values.get(i) < values.get(i + 1)) {
                if (keys.get(i - 1) < keys.get(i) && keys.get(i) < keys.get(i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
