// oct 03, 2022

class Solution {
    public int findPeakElement(int[] nums) {
        //  binary search to find highest num, if nums next to it are lower than it return the num
        
        int left = 0;
        int right = nums.length - 1;
        int maxNum = 0;
        
        
        while (left < right) {
            int mid = left + (right-left)/2;
            
            if (nums[mid] > nums[mid+1]) {
               right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
        
    }
}
