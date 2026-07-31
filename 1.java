class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums1 = new int[2];
   // what numbers in the list add up to the target number
        for (int i = 0; i <= nums.length; i++) {            
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] ans = {i, j};
                    return ans;
                
                }
            }
        }
        return new int[2];
        }
        
        
    }   
