class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> map=new HashMap<>();
       int max=0;
       int pre=0;
       if(s.length()<=1) return s.length();
       map.put(s.charAt(0),0);
       for(int i=1;i<s.length();i++){
        while(map.containsKey(s.charAt(i))){
            max=Math.max(map.size(),max);
            map.remove(s.charAt(pre));
            pre++;
        }
        map.put(s.charAt(i),i);
            max=Math.max(map.size(),max);
       } 
       return max;
    }
}