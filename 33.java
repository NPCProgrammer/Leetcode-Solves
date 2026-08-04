class Solution {
    public int search(int[] nums, int target) {
        int min = minNum(nums, target);
        

        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            System.out.println("lower search" + min);
            return search1(nums, min, nums.length - 1, target);
        }
        else {
            System.out.println("higher search");
            return search1(nums,0,min,target);
        }
        
    }
    // find min num in nums, then use that as your left and go up if the target is between min num and last num
    private int search1(int[] nums,int left, int right, int target) { 
        int l = left;
        int r = right;
        while (l<=r) {
            int mid = l + (r - l)/2;
            
            
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
        
        
    }

    public int minNum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left<right) {
            int mid = left + (right - left)/2;
            //System.out.println("Mid: " + mid);

            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                //System.out.println("Mid: " + mid);
                return mid;
            }
            else if (nums[left] <= nums[mid] && nums[mid] >= nums[right]){  
                left = mid + 1;
                //System.out.println("left: " + left);
            }
             else {
                right = mid - 1;
                //System.out.println("right: " + right);
            }
                
        }
        return left;
    }
} 