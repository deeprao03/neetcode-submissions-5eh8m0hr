class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        HashMap<Character,Integer>ft = new HashMap<>();
        for(char ch : t.toCharArray()){
            ft.put(ch,ft.getOrDefault(ch,0)+1);
        }
        int maxChar = ft.size();
        int having = 0;
        HashMap<Character,Integer>st = new HashMap<>();
        int l = 0;
        int r = 0;
        int start = -1;
        int minLen = Integer.MAX_VALUE;
        while(r<s.length()){
            char ch = s.charAt(r);
            st.put(ch,st.getOrDefault(ch,0)+1);
            if(ft.containsKey(ch) && ft.get(ch)==st.get(ch)){
                having++;
            }
            while(having==maxChar){
                if(r-l+1<minLen){
                    start = l;
                    minLen = r-l+1;
                }
                char temp = s.charAt(l);
                l++;
                st.put(temp,st.get(temp)-1);
                if(ft.containsKey(temp) && ft.get(temp)>st.get(temp)){
                    having--;
                }
            }
            r++;
        }
        return start==-1?"":s.substring(start,start+minLen);
    }
}
