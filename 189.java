// June 30th, 2022

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k %= nums.length;
        nums = reverse(nums, 0, n);
		nums = reverse(nums, 0, k - 1);
		nums = reverse(nums, k, n);
	}
    public static int[] reverse(int[] nums, int l, int r) {
		int p = 0;
		while (l<r) {
			p = nums[l];
            nums[l] = nums[r];
			nums[r] = p;
			l++;
			r--;
		}
		
		
		return nums;
	}
}