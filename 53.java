// Oct 03, 2022

class Solution {
    
    // binary search, find if left or right side is sorted, then if the mid is less than your minNum set mid as minnum, repeat while left < right, return minNum
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        int minNum = Integer.MAX_VALUE;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] <= nums[mid]) {
                // nums on left are sorted
                if (nums[left] < minNum) minNum = nums[left];
                left = mid + 1;
            }
            else {
                if (nums[mid] < minNum) minNum = nums[mid];
                right = mid - 1;
            }
        }
        return minNum;
        
        
    }
}