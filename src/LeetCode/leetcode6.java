package LeetCode;

/**
 * Author: FZX
 * Date: 2021/5/4 10:42
 */
public class leetcode6 {
    public static String convert(String s, int numRows) {

        int len=s.length();
        if(numRows==1){return s;}
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j+i < len; j+=(2*numRows-2)) {

                res.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + 2*numRows-2 - i < len)
                    res.append(s.charAt(j + 2*numRows-2 - i));


//
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert( "PAYPALISHIRING",  3));
    }
}
