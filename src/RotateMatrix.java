public class RotateMatrix {

    public static void Rotate(int[][] matrix){
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];


        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++){
            int first = layer;
            int last = n - 1- layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];

                matrix[last - offset][first] = matrix[last][last - offset];

                matrix[last][last - offset] = matrix[i][last];

                matrix[i][last] = top;
            }
        }


        System.out.println("Rotated matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if(j < matrix[i].length - 1)
                    System.out.print(",");
            }
            System.out.println();
        }
    }

}
