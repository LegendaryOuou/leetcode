#### [53. 最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)

> 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
>

```java
public int maxSubArray(int[] nums) {
	int pre = 0, max = nums[0];
    for(int item : nums){
        pre = Math.max(pre+item,item);
        if(pre>max) max=pre;
    }
    return max;
}
```

