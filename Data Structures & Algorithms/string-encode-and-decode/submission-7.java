class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int len = 0;
            int start = i;
            while(start<str.length() && str.charAt(start)!='#'){
                start++;
            }
            String faltu = str.substring(i,start);
            len = Integer.parseInt(faltu);
            start++;
            String temp = str.substring(start,start+len);
            ans.add(temp);
            i = start + len;
        }
        return ans;
    }
}
