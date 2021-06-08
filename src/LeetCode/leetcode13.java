package LeetCode;

import java.util.HashMap;

public class leetcode13 {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int l = s.length();
        int i = 0;
        int result = 0;
        for (int j = 0; j < l; j++) {
            int value=hashMap.get(s.charAt(j));
            if(j<l-1&&hashMap.get(s.charAt(j+1))>value){
                result-=value;
            }
            else {
                result+=value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
