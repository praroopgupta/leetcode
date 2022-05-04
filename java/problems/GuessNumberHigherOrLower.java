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
        if(guess(n) == 0)
            return n;
        int first = 1;
        int last = n;
        int ans = 0;
        while(first<=last) {
            int mid = first + (last - first)/2;
            if(guess(mid) == 0){
                return mid;
            } else if(guess(mid) == -1){
                last = mid -1;
            } else {
                first = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}