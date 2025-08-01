class Solution {
    public List<List<Integer>> generate(int n) {

        List<List<Integer>> ls = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        list.add(1);

        ls.add(new ArrayList<>(list));
        if (n == 1)
            return ls;

        list.add(1);

        ls.add(new ArrayList<>(list));

        if (n == 2)
            return ls;

        for (int i = 2; i < n; i++) {
            List<Integer> temp = new ArrayList<>(ls.get(i - 1));

            List<Integer> temp1 = new ArrayList<>();
            temp1.add(1);
            for(int j=0;j<temp.size()-1;j++){
            temp1.add(temp.get(j)+temp.get(j+1));

            }
            temp1.add(1);

            ls.add(new ArrayList<>(temp1));   
        }
        return ls;
    }
}