# Aug 07, 2026 12:50

from typing import List

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        # recursion
        comb =  {
           2 : ["a", "b", "c"] ,
           3 : ["d", "e", "f"],
           4 : ["g", "h", "i"],
           5 : ["j", "k", "l"],
           6 : ["m", "n", "o"],
           7 : ["p", "q", "r", "s"],
           8 : ["t", "u", "v"],
           9 : ["w", "x", "y", "z"]
        }
        res = []
        def helper(index, currComb):
            if len(digits) <= len(currComb):
                res.append(currComb)
                return
            digit = int(digits[index])
            letters = comb[digit]
            for letter in letters:
                helper(index+1, currComb+letter)

        helper(0, "")
        return res