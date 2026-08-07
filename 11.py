# Aug 07, 2026 08:50

from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        left = 0
        right = len(height) - 1
        diff = 0
        calc = 0
        leftVal = 0
        rightVal = 0
        # can probably optimize with myDict = {}
        while left < right:
            leftVal = height[left]
            rightVal = height[right]
            diff = right - left
            if (leftVal < rightVal):
                if leftVal * diff > maxArea:
                    maxArea = leftVal * diff
                left = left + 1
            elif (leftVal > rightVal):
                if rightVal * diff > maxArea:
                    maxArea = rightVal * diff
                right = right - 1
            else:
                if leftVal * diff > maxArea:
                    maxArea = leftVal * diff
                left = left + 1
                right = right - 1
        
        return maxArea
