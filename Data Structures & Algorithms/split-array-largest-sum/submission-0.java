class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;
        for(int i=0;i<nums.length;i++){
            s = Math.max(s,nums[i]);
            e += nums[i];
        }
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(isPossible(nums,mid,k)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[]arr, int reqSum, int k){
        int sum = 0;
        int cnt = 1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>reqSum){
                sum = arr[i];
                cnt++;
            }
            else{
                sum+=arr[i];
            }
        }
        return cnt<=k;
    }
}