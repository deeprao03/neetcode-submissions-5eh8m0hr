class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[]dp = new int[n];
        Arrays.fill(dp,-1);
        return  Math.min(helper(cost,n-1,dp), helper(cost,n-2,dp));
    }
    static int helper(int[]arr, int ind,int[]dp){
        if(ind==0) return arr[ind];
        if(dp[ind]!=-1) return dp[ind];
        int oneJump = helper(arr,ind-1,dp) + arr[ind];
        int twoJump = arr[ind];
        if(ind>=2){
            twoJump = helper(arr,ind-2,dp) + arr[ind];
        }
        return dp[ind] = Math.min(oneJump,twoJump);
    }
}
