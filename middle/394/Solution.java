class Solution {
	/*
	执行用时：6 ms, 在所有 Java 提交中击败了9.54%的用户
	内存消耗：36.7 MB, 在所有 Java 提交中击败了30.74%的用户
	*/
    public String decodeString(String s) {
        List<Integer> stack = new LinkedList<>();
        for (int i = 0; ;i++) {
            if(i>=s.length()) break;
            char ch = s.charAt(i);
            if(ch=='[') stack.add(0,i);
            else if(ch==']'){
                int right = stack.remove(0);
                int left=right-1;
                while(left>=0&&s.charAt(left)>='0'&&s.charAt(left)<='9') left--;
                int times = Integer.parseInt(s.substring(left+1,right));
                StringBuilder sb = new StringBuilder();
                String repeatString = s.substring(right+1,i);
                for (int j = 0; j < times; j++) {
                    sb.append(repeatString);
                }
                s = s.substring(0,left+1)+sb.toString()+s.substring(i+1,s.length());
                i=left;
            }
        }
        return s;
    }
}