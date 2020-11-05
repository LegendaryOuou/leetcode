import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                index[0]=hash.get(nums[i]);
                index[1]=i;
                break;
            }
            hash.put(target-nums[i],i);
        }
        return index;
    }
}