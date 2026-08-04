class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null) {
            return new int[]{-1, -1};
        }
         int left = lowerBound(nums, target);
        int right = upperBound(nums, target);
        if (left > right) {
            return new int[] {-1,-1};
        }
        return new int[]{left, right};
    }
    private static int lowerBound(int[] nums, int target) {
        final int n = nums.length;
        
        int low = 0;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return low;
        
    }  

    private static int upperBound(int[] nums, int target) {
        final int n = nums.length;
        
        int low = 0;
        int high = n;
            
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > target) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return high - 1;
        
    }  
    
}