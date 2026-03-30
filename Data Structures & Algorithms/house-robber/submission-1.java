class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
    static int helper(int[]arr, int ind,int[]dp){
        if(ind<0) return 0;
        if(ind==0) return arr[ind];
        if(dp[ind]!=-1) return dp[ind];
        // nottake
        int nottake = helper(arr,ind-1,dp);
        // take
        int take = arr[ind] + helper(arr,ind-2,dp);
        return dp[ind] = Math.max(take,nottake);
    }
}
