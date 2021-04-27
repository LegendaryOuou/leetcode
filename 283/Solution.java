class Solution {
    /*
    依次访问数组中的元素，如果发现一个0，标记这个0为第一次出现0的位置，标记为zerolow；继续遍历，如果紧接着又出现了0，不管它，继续访问下一个元素，
    直到找到一个非0的元素，将这个非0的元素放在第一次出现0的位置，同时将zerolow+1，因为如果zerolow+1<nums.length,该位置元素值一定是0
	（思路有点乱了，评论区有思路更简单的（实际上跟这个本质上是一样的））
	

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.8 MB, 在所有 Java 提交中击败了68.42%的用户
     */
    public static void moveZeroes(int[] nums) {
        int zerolow=-1;
        boolean isFirst=false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0 && isFirst==false) {
                zerolow=i;
                isFirst=true;
            }else if(nums[i]!=0 && isFirst==true){
                nums[zerolow]=nums[i];
                nums[i]=0;
                zerolow++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for (int item:
             nums) {
            System.out.print(item+" ");
        }
    }
}