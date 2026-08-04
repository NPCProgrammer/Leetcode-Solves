class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        myDict = {
             "]" : "[",
             ")" : "(",
             "}" : "{"

        }
        for char in s:
            if char == "[" or char == "(" or char == "{":
                stack.append(char)
            elif char == "]" or char == ")" or char == "}":
                if len(stack) != 0:
                    if stack[-1] == myDict[char]:
                        stack.pop()
                    else:
                        return False
                else:
                    return False
        if len(stack) == 0:
            return True
        else:
            return False