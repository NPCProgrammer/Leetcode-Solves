class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        mini = min(strs, key = len)
        res = ""

        for i in range(len(mini)):  # for every character in the smallest string in the list
            for s in strs: # for each character of [i] in strs
                if i == len(s) or s[i] != mini[i]:  # if i is on the last string, or if the letter doesnt equal mini letter
                    return res

            res += mini[i]  # now that mini[i] is confirmed to be a letter, add it to res, and it does that fore every letter of mini
        return res