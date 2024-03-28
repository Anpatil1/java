package Assigmnent.ClassAndObject;

public class Matrix1 {
    private int[][] elements;

    // Constructor
    public Matrix1(int rows, int columns) {
        this.elements = new int[rows][columns];
    }

    // Method to get number of rows
    public int getRows() {
        return elements.length;
    }

    // Method to get number of columns
    public int getColumns() {
        return elements[0].length;
    }

    // Method to set individual element
    public void setElement(int row, int column, int value) {
        elements[row][column] = value;
    }

    // Method to add two matrices
    public static Matrix1 add(Matrix1 matrix1, Matrix1 matrix2) {
        int rows1 = matrix1.getRows();
        int columns1 = matrix1.getColumns();
        int rows2 = matrix2.getRows();
        int columns2 = matrix2.getColumns();

        // Check if matrices are addable
        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix1 result = new Matrix1(rows1, columns1);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                result.elements[i][j] = matrix1.elements[i][j] + matrix2.elements[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static Matrix1 multiply(Matrix1 matrix1, Matrix1 matrix2) {
        int rows1 = matrix1.getRows();
        int columns1 = matrix1.getColumns();
        int rows2 = matrix2.getRows();
        int columns2 = matrix2.getColumns();

        // Check if matrices are multipliable
        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix1 result = new Matrix1(rows1, columns2);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result.elements[i][j] += matrix1.elements[i][k] * matrix2.elements[k][j];
                }
            }
        }

        return result;
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        Matrix1 matrix1 = new Matrix1(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix1 matrix2 = new Matrix1(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        System.out.println("Matrix Addition:");
        Matrix1 additionResult = Matrix1.add(matrix1, matrix2);
        if (additionResult != null) {
            additionResult.printMatrix();
        }

        System.out.println("Matrix Multiplication:");
        Matrix1 multiplicationResult = Matrix1.multiply(matrix1, matrix2);
        if (multiplicationResult != null) {
            multiplicationResult.printMatrix();
        }
    }
}
