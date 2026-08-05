// August 06, 2022
class Solution {
    public boolean isPowerOfTwo(int n) {
        return powers(n);
    }
    private boolean powers(int n) {
         if(n <= 0){ return false;}
        int m = -n;
        m &= n;
        return m==n;
        
    }
    
}