class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq=new PriorityQueue<>();

        for(char c:s.toCharArray()){
            if("aieouAEIOU".indexOf(c)!=-1){
                pq.offer(c);
            }
        }

        StringBuilder sb=new StringBuilder(s);

        for(int i=0;i<sb.length();i++){
            if("aeiouAEIOU".indexOf(sb.charAt(i))!=-1){
                sb.setCharAt(i,pq.poll());
            }
        }
        return sb.toString();
    }
}