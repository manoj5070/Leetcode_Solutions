class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<String> ls=new ArrayList<>();
        int n=text.length();
        int count=0;

        char[] broken=new char[brokenLetters.length()];
        int k=0;

        for(char c:brokenLetters.toCharArray()) broken[k++]=c;


        for(int i=0;i<n;){
            int j=i;
            while(j<n && text.charAt(j)!=' '){
                j++;
            }
            String s=text.substring(i,j);
            count++;
            i=j+1;

            for(int a=0;a<brokenLetters.length();a++){
                if(s.indexOf(broken[a])!=-1){
                    count--;
                    break;
                }
            }
        }


        

        return count;
    }
}