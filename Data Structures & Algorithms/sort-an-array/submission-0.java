class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    static void mergeSort(int[]arr, int s, int e){
        if(s>=e) return;
        int mid = (s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    static void merge(int[]arr, int left, int mid, int right){
        int[]temp = new int[right-left+1];
        int k = 0;
        int l = left;
        int r = mid+1;
        while(l<=mid && r<=right){
            if(arr[l]<arr[r]){
                temp[k++] = arr[l++];
            }
            else{
                temp[k++] = arr[r++];
            }
        }
        while(l<=mid){
            temp[k++] = arr[l++];
        }
        while(r<=right){
            temp[k++] = arr[r++];
        }
        for(int i=0;i<k;i++){
            arr[left+i] = temp[i];
        }
    }
}