class Solution {
    public int removeDuplicates(int[] nums) {
        int ret = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                ret++;
                nums[ret] = nums[i];
                
            }
            
        }
        return ret+1;
    }
}
