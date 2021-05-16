class Solution {
	/*
	一个一个分
	
	执行用时：1 ms, 在所有 Java 提交中击败了89.69%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了99.13%的用户
	*/
    public int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int len = candies;
        int index=0;
        while(len>0){
            people[index%num_people]+=index+1;
            index++;
            len-=index;
        }
        people[(index-1)%num_people]+=len;
        return people;
    }
	/*
	数学方法一次分完，思路应该是没问题的，细节上要考虑比较多问题，但是我想先回宿舍了，所以这里就留着吧
	
	*/
}