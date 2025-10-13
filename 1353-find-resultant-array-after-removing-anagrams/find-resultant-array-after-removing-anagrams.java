class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ls=new ArrayList<>();
        Stack<String> st=new Stack<>();
        st.push(words[0]);
        for(int i=1;i<words.length;i++){
            if(same(words[i],st.peek())){
                if(i==words.length-1) break; 
            }else{
                st.push(words[i]); 
            }
        }
        for(String s:st) ls.add(s);
        return ls;
    }
    public boolean same(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] fr1=new int[26];
        int[] fr2=new int[26];
        for(int i=0;i<s1.length();i++){
            fr1[s1.charAt(i)-'a']++;
            fr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fr1[i]!=fr2[i]) return false;
        }
        return true;
    }
}