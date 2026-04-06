class Solution {
    public void reverseString(char[] s) {
        int p = 0;
        int n = s.length;
        int e = n-1;
        while(p<e){
            char temp = s[p];
            s[p] = s[e];
            s[e] = temp;
            p++;
            e--;
        }
    }
}