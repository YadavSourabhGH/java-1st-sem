public class AddTwoMatrix {
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix1 = new int[rows][cols];
            int[][] matrix2 = new int[rows][cols];

            System.out.println("\nEnter elements of first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nEnter elements of second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nFirst Matrix:");
            displayMatrix(matrix1);
            System.out.println("\nSecond Matrix:");
            displayMatrix(matrix2);
            
            int[][] result = addMatrices(matrix1, matrix2);
            System.out.println("\nResultant Matrix:");
            displayMatrix(result);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integer numbers.");
        }
    }
}