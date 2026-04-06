class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int ans = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int cnt = 1;
                while(set.contains(n+1)){
                    cnt++;
                    n = n+1;
                }
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
