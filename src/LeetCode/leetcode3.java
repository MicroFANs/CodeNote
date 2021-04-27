package LeetCode;

import java.util.HashMap;

/**
 * Author: FZX
 * Date: 2021/4/27 21:11
 */
public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
//        int res=1;
//        if(s.equals("")){
//            return 0;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            int tmp=1;
//            char c=s.charAt(i);
//            for (int j = i+1; j <s.length() ; j++) {
//                if (c != s.charAt(j)) {
//                    tmp++;
//                } else {
//                    if (res < tmp) {
//                        res = tmp;
//                    }
//                    break;
//                }
//            }
//
//        }
//        return res;
//        if (s.length()==0) return 0;
//        HashMap<Character,Integer> hashMap=new HashMap<>();
//        int n=s.length();
//        int l=0;
//        int res=0;
//        for (int i = 0; i < n; i++) {
//            if(hashMap.containsKey(s.charAt(i))){
//                l=Math.max(l,hashMap.get(s.charAt(i))+1);
//            }
//            hashMap.put(s.charAt(i),i);
//            res=Math.max(res,i-l+1);
//        }
//        return res;
//    }
        if(s.length()==0) return 0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int l=0;
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if(hashMap.containsKey(s.charAt(i))){
                l=Math.max(hashMap.get(s.charAt(i))+1,l);
            }
            hashMap.put(s.charAt(i),i);
            res=Math.max(res,i-l+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int res=lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
