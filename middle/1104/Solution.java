class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了85.46%的用户
	*/
    public List<Integer> pathInZigZagTree(int label) {
        int layer = 0;
        int _label = label;
        while(_label>0){
            layer++;
            _label/=2;
        }
        List<Integer> ans = new LinkedList<>();
        ans.add(label);
        for (int i = layer-1; i > 0; i--) {
            int low = (int) Math.pow(2,i-1);
            int high = (int) Math.pow(2,i)-1;
            label/=2;
            label = low+high-label;
            ans.add(0, label);
        }
        return ans;
    }
}