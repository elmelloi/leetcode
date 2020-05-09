/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (num1Index in 0..nums.size-2){
            for(num2Index in num1Index+1..nums.size-1){
                if(nums[num1Index] + nums[num2Index] == target){
                    return intArrayOf(num1Index,num2Index)
                }
            }
        }
        return intArrayOf(-1,-1)
    }
}
// @lc code=end

