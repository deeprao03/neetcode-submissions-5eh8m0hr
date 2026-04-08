class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int s = 0;
        int e = 0;
        for(int i=0;i<arr.length;i++){
            s = Math.max(s,arr[i]);
            e += arr[i];
        }
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(isPossible(arr,mid,days)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[]arr, int cap, int days){
        int cnt = 1;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>cap){
                cnt++;
                sum = arr[i];
            }
            else{
                sum +=arr[i];
            }
        }
        return cnt<=days;
    }
}