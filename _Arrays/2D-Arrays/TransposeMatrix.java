public class TransposeMatrix {
    public static void main(String[] args) {
        int a[][] = {
            {10, 20, 30, 40, 50},
            {55, 67, 78, 88, 89},
            {90, 94, 96, 100, 101},
            {105, 110, 120, 130, 141}
        };

        System.out.println("Original Matrix:");
        display(a);

        int[][] transposedMatrix = transpose(a);
        
        System.out.println("\nTransposed Matrix:");
        display(transposedMatrix);
    }

    public static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = a[i][j];
            }
        }
        return transposedMatrix;
    }
}