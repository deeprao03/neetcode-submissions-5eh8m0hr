class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int s = 1;
        int e = arr[0];
        for(int i=1;i<arr.length;i++){
            e = Math.max(e,arr[i]);
        }
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(isPossible(arr,mid,h)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[]arr, int time, int reqTime){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += (arr[i]+time-1)/time;
        }
        return sum<=reqTime;
    }
}
