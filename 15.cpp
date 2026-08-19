#include <algorithm>
#include <vector>

class Solution {
public:
    std::vector<std::vector<int>> threeSum(std::vector<int>& nums) {
        std::sort(nums.begin(), nums.end());
        std::vector<std::vector<int>> result;
        result.reserve(nums.size()); 
        for (int i = 0; i < nums.size(); i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }   


            findUniquePairs(nums, -nums[i], i+1, nums[i], result);
        }
        return result;
        
    }
private:
    void findUniquePairs(const std::vector<int>& nums, const int& target, const int& start, const int& firstNum, std::vector<std::vector<int>>& result) {
        int left = start, right = nums.size() - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result.push_back({firstNum, nums[left], nums[right]});
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right + 1]) right--;
            } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
}



};