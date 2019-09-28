package onehd;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class SetMatrixZeroes_73 {
    public void setZeroes(int[][] matrix) {
        if(matrix.length==0) return;

        boolean rowZeroFlag = false;
        for(int j=0;j<matrix[0].length;++j){
            if(matrix[0][j]==0) rowZeroFlag = true;
        }
        for(int i=1;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;++i){
            for(int j=1;j<matrix[0].length;++j){
                if(matrix[i][0]==0||matrix[0][j]==0) matrix[i][j]=0;
            }
        }
        //set first column
        if(matrix[0][0]==0){
            for(int i=0;i<matrix.length;++i){
                matrix[i][0]=0;
            }
        }
        //set first row
        if(rowZeroFlag){
            for(int j=0;j<matrix[0].length;++j){
                matrix[0][j]=0;
            }
        }
    }
}
