import kotlin.collections.ArrayDeque

class Solution {
    fun isValid(s: String): Boolean {
        if(s.length%2!=0)return false
        val stack = ArrayDeque<Char>()
        val pair = mapOf(')' to '(',']' to '[','}' to '{')
        for(c in s){
            if(c in pair){
                if(stack.removeLastOrNull()!=pair[c]) return false
            } else {
                stack.addLast(c)
            }
        }
        return stack.isEmpty()
    }
}
