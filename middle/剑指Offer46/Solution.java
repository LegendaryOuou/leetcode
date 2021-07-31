class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了65.76%的用户
	*/
    public int translateNum(int num) {
        List<Integer> list = new LinkedList<>();
        int _num=num;
        while(_num>0){
            list.add(0,_num%10);
            _num/=10;
        }
        return get(list,0);
    }
    private int get(List<Integer> list,int position){
        int len = list.size();
        if(position < len){
            int two=-1;
            if(position+1<len) two = list.get(position)*10+list.get(position+1);
            if(two!=-1&&two<26&&list.get(position)!=0){
                return get(list,position+1)+get(list, position+2);
            }else{
                return get(list,position+1);
            }
        }else if(position==len) return 1;
        else return 0;

    }
}