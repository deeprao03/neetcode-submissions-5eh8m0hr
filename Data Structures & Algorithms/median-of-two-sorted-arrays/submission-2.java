class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n>m) return findMedianSortedArrays(nums2,nums1);

        int totalEle = n+m;
        int left = (totalEle+1)/2;
        int s = 0;
        int e = n;
        while(s<=e){
            int mid1 = (s+e)/2;
            int mid2 = left-mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1>0) l1 = nums1[mid1-1];
            if(mid2>0) l2 = nums2[mid2-1];
            if(mid1<n) r1 = nums1[mid1];
            if(mid2<m) r2 = nums2[mid2];

            if(l1<=r2 && l2<=r1){
                if(totalEle%2==0){
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/(double)(2);
                }
                else{
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                e = mid1-1;
            }
            else{
                s = mid1+1;
            }
        }
        return 0;
    }
}
