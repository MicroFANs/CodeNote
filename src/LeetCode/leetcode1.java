package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dic=new HashMap<>();
        int [] res=new int[2];

        for (int i = 0; i < nums.length; i++) {
            if(dic.containsKey(target-nums[i])){
                res[1]=i;
                res[0]=dic.get(target-nums[i]);
                return res;
            }
            dic.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int traget=9;
        int [] res=new leetcode1().twoSum(nums,traget);
        System.out.println(Arrays.toString(res));

    }
}
