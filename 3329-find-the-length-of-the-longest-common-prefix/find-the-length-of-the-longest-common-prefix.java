class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            while(num>0){
                set.add(num);
                num/=10;
            }
        }
        for(int num:arr2){
            while(num>0){
                if(set.contains(num)){
                    ans=Math.max(ans,num);
                    break;
                }
                num/=10;
            }
        }
        int count=0;
        while(ans>0){
            ans/=10;
            count++;
        }
        return count;
    }
}