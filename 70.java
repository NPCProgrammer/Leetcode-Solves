class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0)
            a = (b = b + a) - a;
        return a;
    }
}