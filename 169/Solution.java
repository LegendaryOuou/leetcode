import java.util.HashSet;
import java.util.Set;

public class Solution {
    /*
    思路一：上去就是干！！！

    执行用时：4 ms, 在所有 Java 提交中击败了29.51%的用户
    内存消耗：44.2 MB, 在所有 Java 提交中击败了13.92%的用户
    public static int majorityElement(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int len= nums.length;
        int major=nums[0];
        s.add(nums[0]);
        int majorCount = 0;
        while(true){
            for (int i = 0; i < len; i++) {
                if(major==nums[i]) majorCount++;
                if(majorCount>len/2) return major;
                if(majorCount+len/2<=i) {
                    majorCount=0;
                    for (int j = 0; j < len; j++) {
                        if(nums[j]!=major&&s.contains(nums[j])==false) {
                            major=nums[j];
                            s.add(nums[j]);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
     */

    /*
    炸了
    第二次查找可以去掉，因为n/2处得元素一定是目标元素

    执行用时：2175 ms, 在所有 Java 提交中击败了5.06%的用户
    内存消耗：41.5 MB, 在所有 Java 提交中击败了87.22%的用户
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if(nums[j]<nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int count=0;
        int point = 1;
        for (int i = 1; i < len; i++) {
            if(nums[i]==nums[point]) {
                count++;
                if(count>len/2) return count;
            }else{
                point=i;
                count=1;
            }

        }
        return -1;
    }
     */

    /*
    Boyer-Moore投票算法，厉害了这个

    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：41.6 MB, 在所有 Java 提交中击败了82.58%的用户
     */
    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int item:nums){
            if(count==0) candidate=item;
            count+=candidate==item?1:-1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums={3,2,3};
        int[] nums1={6,5,5};
        System.out.println(majorityElement(nums));
    }
}