package Coding;

public class RotateMatrix {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotated[][] = roatedMatrix(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] roatedMatrix(int[][] arr) {

        int n = arr.length;

        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                rotated[j][n - i - 1] = arr[i][j];
            }
        }

        return rotated;
    }
}
