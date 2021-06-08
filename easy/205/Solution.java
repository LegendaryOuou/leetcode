class Solution {
	/*
	执行用时：10 ms, 在所有 Java 提交中击败了78.46%的用户
	内存消耗：38.6 MB, 在所有 Java 提交中击败了24.68%的用户
	*/
    public boolean isIsomorphic(String s, String t) {
        int[] arr1=new int[128];
        int[] arr2=new int[128];
        int len1=s.length(),len2=t.length();
        for(int i=0;i<len1;i++){
            arr1[s.charAt(i)]= t.charAt(i);
            arr2[t.charAt(i)]= s.charAt(i);
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb1.append(Character.toChars(arr1[s.charAt(i)]));
            sb2.append(Character.toChars(arr2[t.charAt(i)]));
        }
        return sb1.toString().equals(t)&&sb2.toString().equals(s);
    }
}