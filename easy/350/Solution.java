class Solution {
	/*
	执行用时：10 ms, 在所有 Java 提交中击败了5.40%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了95.02%的用户
	*/
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        int len1 = nums1.length,len2 = nums2.length;
        if(len1<len2){
            int[] visited = new int[len2];
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if(nums1[i]==nums2[j]&&visited[j]==0){
                        list.add(nums1[i]);
                        visited[j]=1;
                        break;
                    }
                }
            }
        }else{
            int[] visited = new int[len1];
            for(int i=0;i<len2;i++){
                for(int j=0;j<len1;j++){
                    if(nums1[j]==nums2[i]&&visited[j]==0){
                        list.add(nums2[i]);
                        visited[j]=1;
                        break;
                    }
                }
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}