class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]leftPro = new int[n];
        leftPro[0] = 1;
        int right = 1;
        for(int i=1;i<n;i++){
            leftPro[i] = leftPro[i-1] * nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            leftPro[i] = leftPro[i] * right;
            right = right*nums[i]; 
        }
        return leftPro;
    }
}  
