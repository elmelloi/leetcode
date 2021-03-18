class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // 对比官方解法去除了对 rev = Integer.MAX_VALUE/10，pop大于7，小于-8的判断。因为从输入条件来看：当位数为最大时，最高位必定时小于2的。
            if (rev > Integer.MAX_VALUE/10) return 0;
            if (rev < Integer.MIN_VALUE/10) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

