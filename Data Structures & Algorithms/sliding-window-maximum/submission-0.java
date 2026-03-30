class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        int l = 0;
        int n = nums.length;
        int []ans = new int[n-k+1];
        int ind = 0;
        ans[ind++] = pq.peek();
        for(int r=k;r<nums.length;r++){
            pq.remove(nums[l++]);
            pq.add(nums[r]);
            ans[ind++] = pq.peek();
        }
        return ans;
    }
}
