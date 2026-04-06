class Solution {
    public boolean validPalindrome(String str) {
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                String newLeftString = str.substring(0,s) + str.substring(s+1);
                String newRightString = str.substring(0,e) + str.substring(e+1);

                return isPalindrome(newLeftString) || isPalindrome(newRightString);
            }
            s++;
            e--;
        }
        return true;
    }
    static boolean isPalindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}