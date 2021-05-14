class Solution {

    int[][] memo;

    public int numTrees(int n) {
        memo = new int[n + 1][n + 1];
        return count(1, n);
    }

    int count(int origin, int destination) {
        // 题解是 origin > destination,内存消耗要大一点。
        if (origin >= destination)
            return 1;

        if (memo[origin][destination] != 0) {
            return memo[origin][destination];
        }
        int sum = 0;
        for (int i = origin; i <= destination; i++) {
            sum += count(origin, i - 1) * count(i + 1, destination);
        }
        memo[origin][destination] = sum;

        return sum;
    }
}
