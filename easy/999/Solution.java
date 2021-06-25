class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了81.34%的用户
	*/
    public int numRookCaptures(char[][] board) {
        int rowR=-1,colR=-1;
        for(int i=0;i<8;i++){
            boolean find = false;
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    rowR=i;
                    colR=j;
                    find=true;
                    break;
                }
            }
            if(find) break;
        }
        int sum=0;
        for(int i=rowR;i>=0;i--){
            if(board[i][colR]=='B') break;
            else if(board[i][colR]=='p') {
                sum+=1;
                break;
            }
        }
        for(int i=rowR;i<8;i++){
            if(board[i][colR]=='B') break;
            else if(board[i][colR]=='p') {
                sum+=1;
                break;
            }
        }
        for(int i=colR;i>=0;i--){
            if(board[rowR][i]=='B') break;
            else if(board[rowR][i]=='p') {
                sum+=1;
                break;
            }
        }
        for(int i=colR;i<8;i++){
            if(board[rowR][i]=='B') break;
            else if(board[rowR][i]=='p') {
                sum+=1;
                break;
            }
        }
        return sum;
    }
}