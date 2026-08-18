#include <cmath>
#include <string>
#include <unordered_map>

class Solution {
public:
    std::string intToRoman(int num) {
        static std::unordered_map<int, std::string> numMap = {
        {1, "I"},
        {4, "IV"},
        {5, "V"},
        {9, "IX"},
        {10, "X"},
        {40, "XL"},
        {50, "L"},
        {90, "XC"},
        {100, "C"},
        {400, "CD"},
        {500, "D"},
        {900, "CM"},
        {1000, "M"}
        };
        int length = static_cast<int>(std::to_string(num).length());
        std::string result = "";
        int digit = 0;
        int search =  std::pow(10, length-1);
        for (int i = length-1; i>=0; i--) {
            
            digit = num / search;
            //std::cout << digit;

            if (digit < 4) {
                for (int j =0; j < digit; j++) {
                    result.append(numMap[search]);
                }
            }
            else if (digit == 4 || digit == 9) {
                result.append(numMap[digit * search]);
            }
            else {
                result.append(numMap[5*search]);
                for (int j = 0; j < digit - 5; j++) {
                    result.append(numMap[search]);
                }
            }
            num = num - digit*search;
            search = search / 10;
        }

        return result;
    }
};
