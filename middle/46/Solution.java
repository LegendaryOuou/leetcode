class Solution {
	/*
	勉勉强强
	
	执行用时：5 ms, 在所有 Java 提交中击败了5.29%的用户
	内存消耗：38.9 MB, 在所有 Java 提交中击败了6.97%的用户
	*/
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        for (int num : nums) {
            List<Integer> list = new LinkedList<>();
            list.add(num);
            res.add(list);
        }
        for (int i = 0; i < len - 1; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> list = res.remove(0);
                for (int k = 0; k < len; k++) {
                    if (!list.contains(nums[k])) {
                        List<Integer> ll = new LinkedList<>();
                        for (int l = 0; l < list.size(); l++) {
                            ll.add(list.get(l));
                        }
                        ll.add(nums[k]);
                        res.add(ll);
                    }
                }
            }
        }
        //System.out.println(res.toString());
        return res;
    }
}