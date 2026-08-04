class Solution {
public:
    int mySqrt(int x) {
        double guess = 1;
        double precision = 0.01;

        while ((guess * guess - x) > precision || (x - guess * guess) > precision) {
            guess = 0.5 * (guess + (x/guess));
        }
        return (int)guess;
    }
};