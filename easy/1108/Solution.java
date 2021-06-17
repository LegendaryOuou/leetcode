class Solution {
	/*
	还可以优化
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.4 MB, 在所有 Java 提交中击败了70.57%的用户
	*/
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address.charAt(0));
        for(int i=1;i<address.length()-1;i++){
            char pre=address.charAt(i-1);
            char now=address.charAt(i);
            char next=address.charAt(i+1);
            if(pre>='0'&&pre<='9'&&now=='.'&&next>='0'&&next<='9'){
                sb.append("[.]");
            }else{
                sb.append(now);
            }
        }
        sb.append(address.charAt(address.length()-1));
        return sb.toString();
    }
	/*
	怎么在原字符串上操作还更慢了啊
	
	执行用时：5 ms, 在所有 Java 提交中击败了8.08%的用户
	内存消耗：36.7 MB, 在所有 Java 提交中击败了31.05%的用户
	*/
	public String defangIPaddr(String address) {
        int len=address.length();
        for(int i=0;i<len;i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                address=address.substring(0,i)+"[.]"+address.substring(i+1,len);
                len+=2;
                i+=3;
            }
        }
        return address;
    }
}