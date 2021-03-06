package LeetCode;

/**
 * Author: FZX
 * Date: 2021/5/4 0:28
 */
public class leetcode62 {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0) {
                    dp[0][j] = 1;  //初始化dp数组
                } else if (j == 0) {
                    dp[i][0] = 1;  //初始化dp数组
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; //状态转移方程
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}
