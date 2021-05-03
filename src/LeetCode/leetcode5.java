package LeetCode;

import java.util.HashMap;

/**
 * Author: FZX
 * Date: 2021/4/27 23:02
 */
public class leetcode5 {
    public static String longestPalindrome(String s) {
//        //暴力法
//        String res=s;
//        int maxlen=0;
//        int l=s.length();
//        for (int i = 0; i < l; i++) {
//            for (int j = l-1; j >=i ; j--) {
//                boolean f=isHuiwen(s.substring(i,j+1));
//                //System.out.println(s.substring(i,j+1)+":"+f);
//                if( j-i+1>maxlen && f){
//                    maxlen=j-i+1;
//                    res=s.substring(i,j+1);
//                }
//            }
//        }
//        return res;

        //动态规划
        int l = s.length();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        boolean dp[][] = new boolean[l][l];
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && (j - i + 1 > maxlen)) {
                    left = i;
                    right = j;
                    maxlen = j - i + 1;
                }
            }
        }
        return s.substring(left, right + 1);
    }

    public static boolean isHuiwen(String s) {
//        递归
//        if(s.length()<=1){
//            return true;
//        }
//        if(s.charAt(0)==s.charAt(s.length()-1)){
//            return isHuiwen(s.substring(1,s.length()-1));
//        }
//        return false;


        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(longestPalindrome(s));
    }
}
