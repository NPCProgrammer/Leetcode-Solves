class Solution {
    public void reverseString(char[] s) {
        // loop thru list, pointer on start and finish
        // add letter to new list in reversed order
        // return new list
        int start = 0;
        int finish = s.length - 1;
        while (start!=finish && start < finish) {
            char p = s[finish];
            s[finish] = s[start];
            s[start] = p;
            start++;
            finish--;
        }
    }
}
