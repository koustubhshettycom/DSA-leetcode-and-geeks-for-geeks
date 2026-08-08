class Solution {
    public boolean isHappy(int n) {
        // easy logic use hashset to store if they repeat are not 
        // then follow the question rule
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int sum = 0;

            while(n>0){
                int dgt = n%10;
                sum+= dgt*dgt;
                n/=10;
            }
            n= sum;
        }
        return true;
    }
}//Time complexity is O(logn)