class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int st=0;
        int len=0;
        for(int e=0;e<s.length();e++){
            char c=s.charAt(e);
            if(m.containsKey(c)){
                if(st<=m.get(c)){
                    st=m.get(c)+1;
                }
            }
            len=Math.max(len,e-st+1);
            m.put(c,e);
        }
        return len;
    }
    
}
