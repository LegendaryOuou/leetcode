class Solution {
	/*
	用StringBuilder
	
	执行用时：2 ms, 在所有 Java 提交中击败了99.76%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了46.55%的用户
	*/
    public String addStrings(String num1, String num2) {
        int len1=num1.length(),len2=num2.length();
        StringBuilder sb = new StringBuilder();
        int C = 0,n1=0,n2=0;
        for(int i=len1-1,j=len2-1;i>=0||j>=0;i--,j--){
            if(i<0){
                n2=(int)(num2.charAt(j))-48;
                sb.append((n2+C)%10);
                C = (n2+C)/10;
            }else if(j<0){
                n1=(int)(num1.charAt(i))-48;
                sb.append((n1+C)%10);
                C = (n1+C)/10;
            }else{
                n1 = (int)(num1.charAt(i))-48;
                n2 = (int)(num2.charAt(j))-48;
                sb.append((n1+n2+C)%10);
                C = (n1+n2+C)/10;
            }
        }
        if(C==1)
            sb.append(C);
        return sb.reverse().toString();
    }
}