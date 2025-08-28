/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
        int start =1;
        int end=n;
        // creating binary search
        while(start<=end){
            int mid = start + (end-start)/2;
            int ans=guess(mid);
            if(ans==-1){// case where the pick is less than it is 
                end = mid-1;
            }
            else if(ans==1){//case where the pick is more than it is
                start =mid+1;
            }
            else{
                return mid;// case where it is the answer 
            }
        }
        return -1;
        }
    }
    // Time complexity is good O(logn)