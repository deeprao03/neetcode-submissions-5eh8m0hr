class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = -1;
        int cnt1 = 0;
        int ele2 = -1;
        int cnt2 = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && ele2!=nums[i]){
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if(cnt2==0 && ele1!=nums[i]){
                ele2 = nums[i];
                cnt2= 1;
            }
            else if(ele2==nums[i]) cnt2++;
            else if(ele1==nums[i]) cnt1++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer>ans = new ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]){
                cnt1++;
            }
            if(ele2==nums[i]){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3) ans.add(ele1);
        if(cnt2>nums.length/3) ans.add(ele2);
        return ans;
    }
}