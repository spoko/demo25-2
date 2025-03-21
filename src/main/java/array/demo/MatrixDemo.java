package array.demo;

public class MatrixDemo {
    public static void main(String[] args) {
        int [][] matrix = {
                {4, 5, 8, 6, 5},
                {5, 8, 3},
                {1, 66},
                {56, 4, 212, 345}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("Element in position %d%d is %d.\n", i, j, matrix[i][j]);
            }
        }
    }
}
