package onehd;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class WordSearch_79 {
    public boolean exist_v0(char[][] board, String word) {
        return false;
    }

    /**
     * simple dfs
     */
    public boolean exist(char[][] board, String word) {
        if(board.length==0||board[0].length==0) return word.length()==0;
        //boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                if(board[i][j]==word.charAt(0)){
                    //start searching
                    if(dfs(board,i,j,1,word)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int y, int x, int curr, String word) {
        if(curr==word.length()){
            return true;
        }
        char temp = board[y][x];
        board[y][x]='`';
        if(y<board.length-1 && board[y+1][x]==word.charAt(curr)){
            if(dfs(board, y+1, x, curr+1, word)) return true;
        }
        if(x<board[0].length-1 && board[y][x+1]==word.charAt(curr)){
            if(dfs(board, y, x+1, curr+1, word)) return true;
        }
        if(y>0 && board[y-1][x]==word.charAt(curr)){
            if(dfs(board, y-1, x, curr+1, word)) return true;
        }
        if(x>0 && board[y][x-1]==word.charAt(curr)){
            if(dfs(board, y, x-1, curr+1, word)) return true;
        }
        board[y][x]=temp;
        return false;
    }
}
