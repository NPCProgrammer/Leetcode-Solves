class Solution {
    public void moveZeroes(int[] nums) {
        int ballsize = 0;
        int i = 0;
        while (i<nums.length) {
            if (nums[i] == 0) {
                ballsize++;
            }
            else if (ballsize>0) {
                int newest = nums[i];
                nums[i] = 0;
                nums[i-ballsize] = newest;
                
                
            }
           i++;

                
        }
    
    }
}
