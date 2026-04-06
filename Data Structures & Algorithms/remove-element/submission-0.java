class Solution {
    public int removeElement(int[] nums, int val) {
        int ind = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                ind=i;
                break;
            }
        }
        if(ind==-1) return nums.length;
        for(int i=ind+1;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ind] = nums[i];
                nums[i] = val;
                ind++;
            }
        }
        return ind;
    }
}