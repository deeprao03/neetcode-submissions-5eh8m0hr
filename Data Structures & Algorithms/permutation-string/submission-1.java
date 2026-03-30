class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]prev = new int[26];
        for(char ch : s1.toCharArray()){
            prev[ch-'a']++;
        }
        int l = 0;
        int r = 0;
        int[]window = new int[26];
        while(r<s2.length()){
            while(r-l+1>s1.length()){
                window[s2.charAt(l)-'a']--;
                l++;
            }
            window[s2.charAt(r)-'a']++;
            if(Arrays.equals(window,prev)) return true;
            r++;
        }
        return false;
    }
}
