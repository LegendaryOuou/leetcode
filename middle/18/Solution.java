class Solution {
	/*
	勉强过关
	
	执行用时：54 ms, 在所有 Java 提交中击败了8.57%的用户
	内存消耗：39.5 MB, 在所有 Java 提交中击败了5.06%的用户
	*/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        int len=nums.length;
        if(len<4) return ans;
        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            for(int j=i+1;j<len-2;j++){
                int tt = target-nums[i]-nums[j];
                int left=j+1;
                int right=len-1;
                while(left<right){
                    int sum = nums[left]+nums[right];
                    if(sum==tt){
                        boolean repeat = false;
                        Iterator<List<Integer>> iterator = ans.iterator();
                        while(iterator.hasNext()){
                            List<Integer> res = iterator.next();
                            if(res.get(0)==nums[i]&&res.get(1)==nums[j]&&res.get(2)==nums[left]&&res.get(3)==nums[right]){
                                repeat = true;
                                break;
                            }
                        }
                        if(repeat==false) {
                            List<Integer> res = new LinkedList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[left]);
                            res.add(nums[right]);
                            ans.add(res);
                        }
                        while(left+1<right&&nums[left]==nums[left+1]) left++;
                        right--;
                    }else if(sum<tt) left++;
                    else right--;
                }
            }
        }
        return ans;
    }
}