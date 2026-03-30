class Solution {
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);

    }
    static int helper(int num, int[]dp){
        if(num==0) return 1;
        if(dp[num]!=-1) return dp[num];
        int oneStep = helper(num-1,dp);
        int twoStep = 0;
        if(num>=2){
            twoStep = helper(num-2,dp);
        }
        return dp[num] = oneStep + twoStep;
    }
}
