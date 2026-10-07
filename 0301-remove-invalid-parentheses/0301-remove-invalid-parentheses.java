import java.util.*;

class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {

        int left = 0;
        int right = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                left++;
            } else if (c == ')') {
                if (left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        solve(s, 0, left, right);

        return ans;
    }

    private void solve(String s, int start, int left, int right) {

        if (left == 0 && right == 0) {

            if (isValid(s)) {
                ans.add(s);
            }

            return;
        }

        for (int i = start; i < s.length(); i++) {

            if (i > start && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            if (left > 0 && s.charAt(i) == '(') {

                String next = s.substring(0, i) + s.substring(i + 1);

                solve(next, i, left - 1, right);
            }

            if (right > 0 && s.charAt(i) == ')') {

                String next = s.substring(0, i) + s.substring(i + 1);

                solve(next, i, left, right - 1);
            }
        }
    }

    private boolean isValid(String s) {

        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }
}