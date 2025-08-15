/*
Problem: Two Sum
LeetCode Link: https://leetcode.com/problems/two-sum/
Date Solved: 15 Aug 2025

Description:
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target. You may assume that each input would have exactly one solution,
and you may not use the same element twice. You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Approach:
- Use a HashMap to store numbers and their indices as we iterate.
- For each number, calculate the complement (target - current number).
- If the complement exists in the map, return the current index and the stored index.
- This ensures O(n) time complexity.
*/

import java.util.HashMap;
import java.util.Map;

class Solution {

    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {}; // Not reached due to problem constraints
    }
}
