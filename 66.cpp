class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size()-1;
        while (digits[size] == 9) {
        
            digits[size] = 0;
            size--;
            if (size+1 == 0) {
                digits.insert(digits.begin(), 1);
                return digits;
            }
        }
        digits[size]++;
        return digits;

    }
};