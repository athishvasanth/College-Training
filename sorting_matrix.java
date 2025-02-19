public class sorting_matrix {
    public static void main(String[] args) {
        int[][] a = {
                {3, 1, 4},
                {9, 2, 6},
                {5, 8, 7}
        };
        int[] result = sorter(a);
        int[] sorted = sort(result);
        int rows = a.length;
        int cols = a[0].length;
        int[][] sorted2d = new int[rows][cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sorted2d[i][j] = sorted[index++];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sorted2d[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] sorter(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[] b = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[index++] = a[i][j];
            }
        }
        return b;
    }

    static int[] sort(int[] result) {
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}
