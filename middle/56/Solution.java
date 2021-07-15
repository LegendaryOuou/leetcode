class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了99.66%的用户
	内存消耗：40.5 MB, 在所有 Java 提交中击败了97.75%的用户
	*/
    public int[][] merge(int[][] intervals) {
        int max = 0;
        for(int[] item:intervals){
            max=Math.max(max,item[1]);
        }
        int[] top = new int[max+1];
        int[] bottom = new int[max+1];
        for(int[] item:intervals){
            top[item[0]]+=1;
            bottom[item[1]]+=1;
        }
        List<Integer> res = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < max+1;) {
            if(top[i]!=0){
                list.add(i);
                top[i]--;
            }else{
                if(bottom[i]!=0){
                    if(list.size()==1){
                        res.add(list.remove(0));
                        res.add(i);
                    }else{
                        list.remove(list.size()-1);
                    }
                    bottom[i]--;
                }else i++;
            }
        }
        int size=res.size();
        int[][] ans = new int[size/2][2];
        for(int i=0;i<size;i+=2){
            ans[i/2][0]=res.remove(0);
            ans[i/2][1]=res.remove(0);
        }
        return ans;
    }
}