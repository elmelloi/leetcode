// 解法1：暴力枚举

// 复杂度分析

// 时间复杂度：O(N^2)，其中 NN 是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
// 空间复杂度：O(1)。

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int length = nums.length;
//        for(int i=0;i<length-1;i++){
//            for(int j=i+1;j<length;j++){
//                if( nums[i] + nums[j] == target){
//                  return new int[]{i,j};
//                }
//            }
//        }
//        return new int[0];
//    }
//}

//解法二：哈希表
// 注意到方法一的时间复杂度较高的原因是寻找 target - x 的时间复杂度过高。因此，我们需要一种更优秀的方法，能够快速寻找数组中是否存在目标元素。如果存在，我们需要找出它的索引。
// 使用哈希表，可以将寻找 target - x 的时间复杂度降低到从 O(N) 降低到 O(1)。
// 这样我们创建一个哈希表，对于每一个 x，我们首先查询哈希表中是否存在 target - x，然后将 x 插入到哈希表中，即可保证不会让 x 和自己匹配。

class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hashtable = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            int appropriateValue =  target - value;
            if(hashtable.containsKey(appropriateValue)){
                return new int[]{hashtable.get(appropriateValue),i};
            }
            hashtable.put(value,i);
        }
        return new int[0];
    }
}
