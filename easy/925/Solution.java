class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了92.13%的用户
	内存消耗：36.3 MB, 在所有 Java 提交中击败了92.82%的用户
	*/
    public boolean isLongPressedName(String name, String typed) {
        int nameLen = name.length(),typedLen=typed.length();
        if(nameLen>typedLen) return false;
        int pointer1=0,pointer2=0;
        int i=1,j=1;
        while(true) {
            while (i < nameLen && name.charAt(i) == name.charAt(i - 1)) i++;
            while (j < typedLen && typed.charAt(j) == typed.charAt(j - 1)) j++;
            //System.out.println("快指针："+i+","+j+"  慢指针："+pointer1+","+pointer2);
            if((i==nameLen&&j<typedLen)||(i<nameLen&&j==typedLen)) return false;
            else if(name.charAt(pointer1)==typed.charAt(pointer2)&&(i-pointer1)<=(j-pointer2)){
                if(i==nameLen&&j==typedLen) return true;
                else{
                    pointer1=i++;
                    pointer2=j++;
                }
            }else{
                return false;
            }
        }
    }
}