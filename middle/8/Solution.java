class Solution {
	/*
	写了个状态机
	
	执行用时：2 ms, 在所有 Java 提交中击败了99.72%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了56.75%的用户
	*/
    static final int S1=0;
    static final int S2=1;
    static final int END=4;
    public int myAtoi(String s) {
        int len=s.length();
        if(len==0) return 0;
        int state=S1;
        int pos=1;
        long res=0;
        for(char ch:s.toCharArray()){
            switch (state){
                case S1:
                    if(ch==' ') state = S1;
                    else if(ch=='+'||ch=='-') {
                        if (ch == '+') pos = 1;
                        else pos = -1;
                        state = S2;
                    }
                    else if(ch>='0'&&ch<='9') {
                        res= res*10 +ch-'0';
                        if(pos*res<Integer.MIN_VALUE) {
                            res=Integer.MIN_VALUE;
                            state=END;
                        }else if(pos*res>Integer.MAX_VALUE) {
                            res=Integer.MAX_VALUE;
                            state=END;
                        }else state = S2;
                    }
                    else state = END;
                    break;
                case S2:
                    if(ch>='0'&&ch<='9') {
                        res= res*10 +ch-'0';
                        if(pos*res<Integer.MIN_VALUE) {
                            res=Integer.MIN_VALUE;
                            state=END;
                        }else if(pos*res>Integer.MAX_VALUE) {
                            res=Integer.MAX_VALUE;
                            state=END;
                        }else state = S2;
                    }else state = END;
                    break;
            }
            if(state==END) break;
        }
        return (int) res*pos;
    }
    }
}