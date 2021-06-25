class Solution {
	/*
	执行用时：4 ms, 在所有 Java 提交中击败了40.92%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了83.54%的用户
	*/
    public String sortString(String s) {
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']+=1;
        }
        StringBuilder sb = new StringBuilder();
        int index=0;
        boolean isIncrease=true;
        boolean added=false;
        while(true){
            while(index>=0&&index<=25){
                if(arr[index]!=0) {
                    sb.append(Character.toChars(index+97)[0]);
                    arr[index]--;
                    added=true;
                }
                if(isIncrease) index++;
                else index--;
            }
            if(!added) return sb.toString();
            else added=false;
            index=index==-1?0:25;
            isIncrease=!isIncrease;
        }
    }
}