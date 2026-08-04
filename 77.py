from typing import List


class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
         res = []


         def backtrack(start, comb): 
            if len(comb) == k:
                res.append(comb.copy()) # so we dont change the value if we chaange comb later on
                return
            for i in range(start, n+1):
                comb.append(i)
                backtrack(i+1, comb)
                comb.pop()

         backtrack(1, [])
         return res