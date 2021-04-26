package Utils;

import DataStructure.ListNode;

import java.util.ArrayList;

/**
 * Author: Fzx
 * Date: 2021/4/26
 */

//工具类
public class Util {
    //显示链表
    public static int showListNode(ListNode l){
        int length=0;
        if(l==null){
            return length;
        }
        ArrayList list=new ArrayList();
        while (l!=null){
            list.add(l.val);
            l=l.next;
            length++;
        }
        System.out.println(list);
        return length;
    }
}
