package onehd;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class RotateImage_48 {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;++i){
            for(int j=0;j<matrix.length-2*i-1;++j){
                //P1: (i,i),P4: (i,matrix.length-1-i)
                //P2:(matrix.length-1-i,i), P3:(matrix.length-1-i, matrix.length-1-i)
                int temp = matrix[i][i+j];
                //P2 -> P1
                matrix[i][i+j] = matrix[matrix.length-1-i-j][i];
                //P3 -> P2
                matrix[matrix.length-1-i-j][i] = matrix[matrix.length-1-i][matrix.length-1-i-j];
                //P4 -> P3
                matrix[matrix.length-1-i][matrix.length-1-i-j] = matrix[i+j][matrix.length-1-i];
                //P1 -> P4
                matrix[i+j][matrix.length-1-i] = temp;
            }
        }
    }
}
