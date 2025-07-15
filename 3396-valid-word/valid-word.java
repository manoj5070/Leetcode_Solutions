class Solution {
    public boolean isValid(String word) {
       int n=word.length();
       if(n<3) return false;
       boolean vowels=vowel(word);
       boolean conso=cons(word);
        for(char ch:word.toCharArray()){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            continue;
        }
        else return false;
       } 
       if(vowels && conso) return true;
       return false;
    }
    private boolean vowel(String s){
        String str="aeiouAEIOU";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && str.indexOf(c)!=-1){
                return true;
            }
        }
        return false;
    }
    private boolean cons(String s){
        String str="aeiouAEIOU";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && str.indexOf(c)==-1){
                return true;
            }
        }
        return false;
    }
}