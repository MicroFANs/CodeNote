package LeetCode;

/**
 * Author: FZX
 * Date: 2021/5/4 15:20
 */
public class leetcode7 {
    public static int reverse(int x) {
        int symbol=1;
        int res=0;
        if(x<0){
            symbol=-1;
            x=-x;
        }
        while (x!=0){
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int tmp=(int)(x%10);
            res=res*10+tmp;
            x=x/10;
        }
        return res*symbol;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
}
