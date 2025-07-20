class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ls=new ArrayList<>();
        Arrays.sort(folder);
        ls.add(folder[0]);
        for(int i=1;i<folder.length;i++){
            String str=folder[i];
            String s=ls.get(ls.size()-1)+'/';
            if(!str.startsWith(s)){
                ls.add(str);
            }
        }
        return ls;
    }
}