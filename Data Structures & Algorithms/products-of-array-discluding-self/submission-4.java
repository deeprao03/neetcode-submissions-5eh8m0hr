class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]leftPro = new int[n];
        leftPro[0] = 1;
        int[]rightPro = new int[n];
        rightPro[n-1] = 1;
        for(int i=1;i<n;i++){
            leftPro[i] = leftPro[i-1] * nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightPro[i] = rightPro[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            leftPro[i] = leftPro[i] * rightPro[i];
        }
        return leftPro;
    }
}  
