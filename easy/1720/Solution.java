class Solution {
	/*
	知识点 
	a^b=c
	a^c=b
	b^c=a
	
	执行用时：2 ms, 在所有 Java 提交中击败了79.24%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了98.86%的用户
	*/
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length;
        int[] res=new int[len+1];
        res[0]=first;
        for(int i=0;i<len;i++){
            res[i+1]=res[i]^encoded[i];
        }
        return res;
    }
}