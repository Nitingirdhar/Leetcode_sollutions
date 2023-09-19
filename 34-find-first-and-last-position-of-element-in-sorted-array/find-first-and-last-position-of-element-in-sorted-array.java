class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1}; 
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                if (result[0] == -1) {
                    result[0] = i; 
                }
                result[1] = i; 
            }
        }
        
        return result; 
    }
}
