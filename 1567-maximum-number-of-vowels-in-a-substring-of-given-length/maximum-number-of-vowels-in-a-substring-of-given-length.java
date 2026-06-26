class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        int j=0;
        int count=0;
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)) count++;
            ans=Math.max(ans,count);
            if(i-j+1==k){
                if(set.contains(s.charAt(j))){
                    count--;
                }
                j++;
            }

        }
        return ans;
    }
}