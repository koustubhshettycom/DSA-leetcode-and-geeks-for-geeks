class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        //Greedy method when 2 arrays are given
        // sort them choose the best possible answer for the exisiting one
        Arrays.sort(players);
        Arrays.sort(trainers);
        int start1=0;
        int start2=0;
        int count=0;
        while(start1<players.length && start2<trainers.length){
            if(players[start1]<=trainers[start2]){
                count++;
                start1++;
                start2++;

            }
            else{
                start2++;
            }
        }
        return count;
    }//Time complexity is O(nlogn) -> for sorting 
}