// 8/5/2026
#include <iostream>
#include <string>
#include <climits>
class Solution {
public:
    int reverse(int x) {
        int temp = x;
        x=0;
        int digit;
        while (temp != 0 && ((x > 0 && (INT_MAX - x) > 0) || (x<0 && (INT_MIN+x) < 0))) {
            digit = temp % 10;
            x = x*10+digit;
        }
        return x;
    }

    int main() {
        Solution sol;

        std::cout << sol.reverse(123) << std::endl;

        return 0;
    }

};