#include <string>
#include <vector>

class Solution {
public:
    std::string convert(std::string s, int numRows) {
        std::vector<std::string> rows(numRows);
        bool top = true;
        int row = 0;
        std::string result = "";

        if (numRows <= 1) {
            return s;
        }
        for (char c : s) {
            rows[row] += c;
            if (top) {
                row = row + 1;
            }
            else {
                row = row - 1;
            }
            if (top && row == numRows-1) {
                top = !top;
            }
            else if (!top && row == 0) {
                top = !top;
            }
        }
        for (std::string str : rows) {
            result += str;
        }

        return result;

    }
};