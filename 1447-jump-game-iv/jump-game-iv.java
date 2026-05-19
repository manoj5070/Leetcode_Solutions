class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        int ans=0;

        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(arr[i],v->new LinkedList<>()).add(i);
        }

        boolean[] visit=new boolean[n];

        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visit[0]=true;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int num=q.poll();
                int left=num-1;
                int right=num+1;
                if(num==n-1) return ans;
                if(left>=0 && !visit[left]){
                    q.add(left);
                    visit[left]=true;
                }
                if(right<n && !visit[right]){
                    q.add(right);
                    visit[right]=true;
                }
                if(map.containsKey(arr[num])){
                    for(int idx:map.get(arr[num])){
                    if(!visit[idx]){
                        q.add(idx);
                        visit[idx]=true;
                    }
                }
                   map.remove(arr[num]);
                }
            }
            ans++;
        }

     return ans;
    }
}