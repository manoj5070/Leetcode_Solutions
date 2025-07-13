class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        while(i<trainers.length && trainers[i]<players[0]){
            i++;
        }
        int count=0;
        int j=0;
        while(j<players.length && i<trainers.length){
            if(players[j]<=trainers[i]){
                 i++;j++;count++;
            }
            else i++;
        }
        return count;
    }
}