class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.4 MB, 在所有 Java 提交中击败了92.79%的用户
	*/
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        int len = time.length();
        char ch1=time.charAt(0);
        char ch2=time.charAt(1);
        if(ch1=='?'){
            if(ch2=='?') sb.append(23);
            else {
                if(ch2-'0'<4) sb.append(2).append(ch2);
                else sb.append(1).append(ch2);
            }
        }
        else if(ch1!='?'){
            if(ch2=='?'){
                if(ch1-'0'==2) {
                    sb.append(23);
                }else{
                    sb.append(ch1).append(9);
                }
            } else{
                sb.append(ch1).append(ch2);
            }
        }
        sb.append(':');
        ch1=time.charAt(3);
        ch2 = time.charAt(4);

        if(ch1=='?'){
            sb.append(5);
        }else{
            sb.append(ch1);
        }
        if(ch2=='?'){
            sb.append(9);
        }else sb.append(ch2);
        return sb.toString();
    }
}