class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ls=new ArrayList<>();
       List<Integer> list=new ArrayList<>();
       list.add(1);
       ls.add(new ArrayList<>(list));
       if(numRows==1) return ls;
       list.add(1);
       ls.add(new ArrayList<>(list));
        for(int i=2;i<numRows;i++){
        List<Integer> temp=new ArrayList<>(ls.get(i-1));
        List<Integer> temp2=new ArrayList<>();
        temp2.add(1);
        for(int j=0;j<temp.size()-1;j++){
            temp2.add((temp.get(j)+temp.get(j+1)));
        }
        temp2.add(1);
        ls.add(new ArrayList<>(temp2));
       } 
       return ls;
    }
}