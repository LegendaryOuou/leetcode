package com.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    /*
    很直接的思路，但是不知道为什么排名有点靠后

    执行用时：1 ms, 在所有 Java 提交中击败了51.24%的用户
    内存消耗：36.1 MB, 在所有 Java 提交中击败了93.83%的用户
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub;
        if(numRows>0) {
            sub = new ArrayList<>();
            sub.add(1);
            list.add(sub);
        }
        if(numRows>1) {
            sub = new ArrayList<>();
            sub.add(1);
            sub.add(1);
            list.add(sub);
        }
        if(numRows>2) {
            for (int i = 2; i < numRows; i++) {
                sub = new ArrayList<>();
                List<Integer> res = list.get(i - 1);
                for (int j = 0; j < res.size()-1; j++) {
                    sub.add(res.get(j)+res.get(j+1));
                }
                sub.add(sub.size(),1);
                sub.add(0,1);
                list.add(sub);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        for (int i = 0; i < res.size(); i++) {
            Iterator<Integer> it = res.get(i).iterator();
            while(it.hasNext()){
                System.out.print(it.next()+',');
            }
            System.out.println();
        }
    }
}