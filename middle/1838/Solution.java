class Solution {
	/*
	思路没问题，超时了
	*/
    public int maxFrequency(int[] nums, int k) {
        int len=nums.length;
        if(len==1) return 1;
        int[] res = new int[len];
        Arrays.sort(nums);
        for (int i = 1; i < len;i++) {
            int _k=k;
            for (int j = i-1; j >= 0 ; j--) {
                _k-=nums[i]-nums[j];
                if(_k>=0) res[i]++;
                else break;
            }
        }
        int ans=0;
        for(int num:res){
            ans=Math.max(ans,num);
        }
        return ans+1;
    }
	/*
	继续超时。。
	*/
	public int maxFrequency(int[] nums, int k) {
        int len=nums.length;
        if(len==1) return 1;
        List<Integer> numList = new LinkedList<>();
        List<Integer> repeatList = new LinkedList<>();
        int last=0;
        Arrays.sort(nums);
        for (int i = 1; i < len; i++) {
            if(nums[i]!=nums[last]) {
                numList.add(nums[last]);
                repeatList.add(i-last);
                last=i;
            }
        }
        numList.add(nums[len-1]);
        repeatList.add(len-last);
        int ans=repeatList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            int num=numList.get(i);
            int count=repeatList.get(i);
            int _k=k;
            for (int j = i-1; j >= 0 ; j--) {
                int singleDistance= num-numList.get(j);
                int allDistance = singleDistance * repeatList.get(j);
                if(_k<allDistance){
                    count+=_k/singleDistance;
                    break;
                }else{
                    count+=repeatList.get(j);
                    _k-=allDistance;
                }
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
	/*
	勉强通过，赶紧看看大佬的做法
	
	执行用时：1819 ms, 在所有 Java 提交中击败了5.07%的用户
	内存消耗：57 MB, 在所有 Java 提交中击败了5.07%的用户
	*/
	public int maxFrequency(int[] nums, int k) {
        int len=nums.length;
        if(len==1) return 1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        int[] numsSet = new ArrayList<>(map.keySet()).stream().mapToInt(Integer::valueOf).toArray();
        Arrays.sort(numsSet);
        int ans=map.get(numsSet[0]);
        for (int i = 1; i < numsSet.length; i++) {
            int count=map.get(numsSet[i]);
            int _k=k;
            for (int j = i-1; j >= 0 ; j--) {
                int singleDistance = numsSet[i]-numsSet[j];
                int allDistance = singleDistance * map.get(numsSet[j]);
                if(_k<allDistance){
                    count+=_k/singleDistance;
                    break;
                }else{
                    count+=map.get(numsSet[j]);
                    _k-=allDistance;
                }
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
	/*
	大佬：滑动窗口
	*/
}