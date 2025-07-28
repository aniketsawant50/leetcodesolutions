Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 


Answers:
class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int temp;

        while(x != 0)
        {
            temp= x %10;
            reverse = reverse *10 +temp;
            x =x /10;

            if(reverse > Integer.MAX_VALUE ||reverse < Integer.MIN_VALUE)
            {
                return 0;
            }
        }
        return (int) reverse;
        
    }
}
