class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        if(m!=n) return false;
        if(s.contains(goal)) return true;
        int j=1;
        while(j<=m){
            StringBuilder sb=new StringBuilder();
            for(int i=j;i<j+m;i++){
                sb.append(goal.charAt(i%m));
            }
            if(s.contains(sb.toString())) return true;
            j++;
        }
        return false;
    }
}