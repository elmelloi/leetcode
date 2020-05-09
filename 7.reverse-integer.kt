/*
 * @lc app=leetcode id=7 lang=kotlin
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {

    fun process(x:Int):Int {
        var result = x
        while(result % 10 == 0){
            result = result / 10
        }
        return result.toString().reversed().toInt()
    }

    fun reverse(x: Int): Int {
        var result = 0
        when{
            x > 0 -> result = process(x)
            x < 0 -> result =  "-${process(x)}".toInt()
        }
        return result
    }
}
// @lc code=end

