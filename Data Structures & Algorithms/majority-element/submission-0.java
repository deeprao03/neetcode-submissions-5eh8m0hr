class Solution {
    public int majorityElement(int[] nums) {
        int ele = -1;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                ele = nums[i];
                cnt = 1;
            }
            else if(ele !=nums[i]){
                cnt--;
            }
            else{
                cnt++;
            }
        }
        return ele;
    }
}