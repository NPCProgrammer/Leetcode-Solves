#include <string>
#include <unordered_map>
#include <vector>

class Solution {
private:
    void helper(const std::string& digits,
                int index,
                std::string curr,
                std::vector<std::string>& res,
                const std::unordered_map<int, std::vector<std::string>>& mappa) {
        if (digits.length() <= curr.length()) {
            res.push_back(curr);
            return;
        }

        int digit = digits[index] - '0';
        const std::vector<std::string>& letters = mappa.at(digit);
        for (const auto& letter : letters) {
            helper(digits, index + 1, curr + letter, res, mappa);
        }
    }

public:
    std::vector<std::string> letterCombinations(std::string digits) {
        const std::unordered_map<int, std::vector<std::string>> mappa = {
            {2, {"a", "b", "c"}},
            {3, {"d", "e", "f"}},
            {4, {"g", "h", "i"}},
            {5, {"j", "k", "l"}},
            {6, {"m", "n", "o"}},
            {7, {"p", "q", "r", "s"}},
            {8, {"t", "u", "v"}},
            {9, {"w", "x", "y", "z"}}
        };

        std::vector<std::string> res;
        helper(digits, 0, "", res, mappa);
        return res;
    }
};
