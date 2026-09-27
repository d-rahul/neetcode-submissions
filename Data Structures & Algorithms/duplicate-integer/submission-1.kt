class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if(nums.isEmpty()){
            return false
        }

        
        val unique = HashSet<Int>()
        for(value in nums){
            if(!unique.add(value)){
                return true
            }
            
        }
        return false
    }
}
