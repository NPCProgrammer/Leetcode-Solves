class Solution:
    def firstBadVersion(self, n) -> int:
        low, high = 1, n
        while low<=high:
            mid=(low+high)//2
            if(isBadVersion(mid)):
                high = mid-1
            else:
                low = mid+1
        return low
