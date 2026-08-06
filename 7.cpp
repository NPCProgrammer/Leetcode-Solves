#include <iostream>
#include <string>
#include <climits>
class Solution {
public:
    int reverse(int x) {
        int temp = x;
        int permtemp = x;
        int counter = 0;
        x=0;
        int digit;
        while (temp != 0 && ((temp > 0 && (INT_MAX - temp) > 0)
                 || (temp<0 && (INT_MIN-temp) < 0))) {
            digit = temp % 10;
            if ((x > INT_MAX/10) || (x == INT_MAX/10 && digit > 7) || ((x < INT_MIN/10) || (x == INT_MIN/10 && digit > 8))) {
                  return 0;
            }
            std::cout << "digit: " << digit << std::endl;
            x = x*10+digit;
            temp = temp / 10;
        }
        return x;
    }
};        











//2147483647= max
// 7463847412
//1534236469=  x (number we are reversing current progress)
// if the currently reversed number gets bigger than INT_MAX/10 we know
// its gonna overflow, same with being under INT_MIN/10

int main() {
        Solution sol;

        std::cout << sol.reverse(1463847412) << std::endl;

        return 0;
    }