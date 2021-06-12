public class Solution {
	/*
	官方分治法
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.9 MB, 在所有 Java 提交中击败了88.33%的用户
	*/
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        n=((n&0x0000ffff)<<16)|((n&0xffff0000)>>>16);
        //System.out.println(Integer.toBinaryString(n));//0101,1100,0010,1000,0000,0010,1000,1111
        n=((n&0x00ff00ff)<<8)|((n&0xff00ff00)>>>8);
        //System.out.println(Integer.toBinaryString(n));//0010,1000,0101,1100,1000,1111,0000,0010
        n=((n&0x0f0f0f0f)<<4)|((n&0xf0f0f0f0)>>>4);
        //System.out.println(Integer.toBinaryString(n));//1000,0010,1100,0101,1111,1000,0010,0000
        n=((n&0x33333333)<<2)|((n&0xcccccccc)>>>2);
        //System.out.println(Integer.toBinaryString(n));//0010,1000,0011,0101,1111,0010,1000,0000
        return ((n&0x55555555)<<1)|((n&0xaaaaaaaa)>>>1);
    }
}