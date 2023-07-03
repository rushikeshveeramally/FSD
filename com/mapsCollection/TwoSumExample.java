package com.mapsCollection;

import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                int complementIndex = numIndices.get(complement);
                return new int[]{complementIndex, i};
            }
            numIndices.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] indices = findTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Output: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }
}

