class Solution {
    public int minNumberOperations(int[] target) {
        int op=0;
        int pre=0;
        for(int i=0;i<target.length;i++){
            int cur=target[i];
            if(cur>pre) op+=cur-pre;
            pre=cur;
        }
        return op;
    }
}