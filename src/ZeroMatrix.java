import java.util.Random;

public class ZeroMatrix {
    int[][] matrix;
    int M, N;
    //Constructor
    public ZeroMatrix(int _M, int _N){
        M = _M;
        N = _N;
        matrix = generateMatrix();
    }

    public int[][] generateMatrix() {

        int[][] _matrix = new int[M][N];

        Random rand = new Random();

        //Generate matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                _matrix[i][j] = 1;
                if(i == M/2 && j == N/2) {
                    _matrix[i][j] = 0;
                }
                System.out.print(_matrix[i][j]);

            }
            System.out.println();
        }

        checkZero(_matrix);

        return _matrix;
    }

    public int[][] checkZero(int[][] matrix){

        int[][] _matrix = matrix;
        int[] zeroIndex = new int[2];

        //Get position of zero
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                if(_matrix[i][j] == 0){
                    zeroIndex[0] = i;
                    zeroIndex[1] = j;
                    break;
                }

            }
        }

        System.out.println("New matrix\n");

        //Set row to 0
        for (int i = 0; i < N; i++) {
            _matrix[zeroIndex[0]][i] = 0;
        }

        //Set column to 0
        for (int i = 0; i < M; i++) {
            _matrix[i][zeroIndex[1]] = 0;
        }

        //Print _matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(_matrix[i][j]);
            }
            System.out.println();
        }

        return _matrix;

    }
}
