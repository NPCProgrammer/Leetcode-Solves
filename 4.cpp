#include <iostream>
#include <vector>
#include <algorithm>

class Solution {
public:
    double findMedianSortedArrays(std::vector<int>& nums1, std::vector<int>& nums2) {
        std::vector<int> result(nums1.size() + nums2.size());
        
        std::merge(nums1.begin(), nums1.end(), 
               nums2.begin(), nums2.end(), 
               result.begin());
        int left = 0;
        int right = result.size() - 1;

        while (left < right) {
            left = left + 1;
            right = right -1;
        }

        return ((result[right] + result[left]) / 2.0);
    }

};