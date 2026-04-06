class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans = new ArrayList<>();
        HashMap<String,ArrayList<String>>map = new HashMap<>();
        for(String s : strs){
            int[]freq = new int[26];
            for(char ch : s.toCharArray()){
                freq[ch-'a']++;
            }
            String code = Arrays.toString(freq);
            if(!map.containsKey(code)){
                map.put(code,new ArrayList<>());
            }
            map.get(code).add(s);
        }
        ans.addAll(map.values());
        return ans;
    }
}
