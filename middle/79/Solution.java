class Solution {
	/*
	执行用时：62 ms, 在所有 Java 提交中击败了91.98%的用户
	内存消耗：36.3 MB, 在所有 Java 提交中击败了93.25%的用户
	*/
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int index=0;
        List<int[]> headList = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(board[i][j]==word.charAt(index)){
                    int[] arr = new int[]{i,j};
                    board[i][j]='#';
                    boolean res = deepVisit(board, word, i, j, 1);
                    if(res) return true;
                    else board[i][j]=word.charAt(index);
                }
            }
        }
        return false;

    }
    private boolean deepVisit(char[][] board,String word,int x,int y,int index){
        int wordLen = word.length();
        if(index==wordLen) return true;

        int left=Math.max(y-1,0);
        int right=Math.min(board[0].length-1, y+1);
        int up=Math.max(x-1,0);
        int down=Math.min(board.length-1, x+1);

        if(board[x][left]==word.charAt(index)){
            if(index==wordLen-1) return true;
            board[x][left]='#';
            boolean res = deepVisit(board, word, x, left, index + 1);
            if(res==false) board[x][left]=word.charAt(index);
            else return true;
        }
        if(board[x][right]==word.charAt(index)){
            if(index==wordLen-1) return true;
            board[x][right]='#';
            boolean res = deepVisit(board, word, x, right, index+1);
            if(res==false) board[x][right]=word.charAt(index);
            else return true;
        }
        if(board[up][y]==word.charAt(index)){
            if(index==wordLen-1) return true;
            board[up][y]='#';
            boolean res = deepVisit(board, word, up, y, index+1);
            if(res==false) board[up][y]=word.charAt(index);
            else return true;
        }
        if(board[down][y]==word.charAt(index)){
            if(index==wordLen-1) return true;
            board[down][y]='#';
            boolean res = deepVisit(board, word, down, y, index+1);
            if(res==false) board[down][y]=word.charAt(index);
            else return true;
        }
        return false;
    }
}