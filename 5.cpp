#include <string>
using namespace std;
class Solution {
public:
    string longestPalindrome(string s) {
        // start at a letter with two pointers, go outwords till you find a none palindrome and update longest
        int longestLength = 1;
        int currlength = 0;
        int left = 0;
        int right = 0;
        int start = 0;
            for (int mid = 0; mid <= s.length() - 1; mid++) {
                left = mid;
                right = mid;
                while (left >= 0 && right <= s.length() - 1 && (s[left] == s[right])) {
                    currlength = right-left+1;
                    if (currlength > longestLength) {
                        longestLength = currlength;
                        start = left;
                    }
                    left--;
                    right++;
                }


                left = mid;
                right = left+1;
                while (left >= 0 && right <= s.length() - 1 && (s[left] == s[right])) {
                    currlength = right-left+1;
                    if (currlength > longestLength) {
                        longestLength = currlength;
                        start = left;
                    }
                    left--;
                    right++;
                }
            }
        


        return s.substr(start, longestLength);
    }
};