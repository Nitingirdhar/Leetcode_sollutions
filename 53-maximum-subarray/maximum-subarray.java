class Solution {
    public int maxSubArray(int[] nums) {
        // Using Kadanen's Algorithm  
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            maxSum = Math.max(cs, maxSum);
        }
        return maxSum;
    }
}