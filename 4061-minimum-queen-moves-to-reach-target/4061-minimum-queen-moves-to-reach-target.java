class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        // easy maths look into the code for solution
        int sr = source[0];
        int sc = source[1];
        int tr = target[0];
        int tc = target[1];

        if(sr==tr&&sc==tc){
            return 0;
        }
        else if(sr-sc==tr-tc || sr+sc==tr+tc||sr==tr||sc==tc){
            return 1;
        }
        else{
            return 2;
        }
    }
}//Time complexity is O(1)