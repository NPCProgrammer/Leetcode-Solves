// Aug 07, 2022

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        //for (int i = 0; i < n.length)
        while (n != 0) {
            ones = ones + (n & 1);
    		n = n>>>1;
        }

        return ones;
    }
}