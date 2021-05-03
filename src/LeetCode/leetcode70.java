package LeetCode;

/**
 * Author: FZX
 * Date: 2021/5/3 23:54
 */
public class leetcode70 {
    public static int climbStairs(int n) {
        int[] dp=new int[n+1];
        for (int i = 0; i <=n; i++) {
            if(i<4){
                dp[i]=i;
            }
            else {dp[i]=dp[i-1]+dp[i-2];}
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
