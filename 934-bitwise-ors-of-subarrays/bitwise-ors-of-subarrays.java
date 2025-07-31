class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> result=new HashSet<>();
        Set<Integer> curr=new HashSet<>();
        Set<Integer> pre=new HashSet<>();
       
        for(int i=0;i<arr.length;i++){
            for(int num:pre){
                curr.add(num|arr[i]);
                result.add(num|arr[i]);
            }
            curr.add(arr[i]);
            result.add(arr[i]);
            pre = new HashSet<>(curr);
            curr.clear();

        }
        return result.size();
    }
}