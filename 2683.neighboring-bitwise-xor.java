/*
 * @lc app=leetcode id=2683 lang=java
 *
 * [2683] Neighboring Bitwise XOR
 */

// @lc code=start
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        boolean ans = true;
        int c = derived[0];
        for(int i=1;i<derived.length;i++){
            c ^= derived[i];
        }
        if(c == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
// @lc code=end

