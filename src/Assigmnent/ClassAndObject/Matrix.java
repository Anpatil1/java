package Assigmnent.ClassAndObject;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    // Getter for number of rows
    public int getRows() {
        return rows;
    }

    // Getter for number of columns
    public int getColumns() {
        return columns;
    }

    // Getter for accessing individual element
    public int getElement(int row, int column) {
        return elements[row][column];
    }

    // Setter for setting individual element
    public void setElement(int row, int column, int value) {
        elements[row][column] = value;
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        Matrix matrix = new Matrix(3, 3);
        // Set some elements
        matrix.setElement(0, 0, 1);
        matrix.setElement(0, 1, 2);
        matrix.setElement(0, 2, 3);
        matrix.setElement(1, 0, 4);
        matrix.setElement(1, 1, 5);
        matrix.setElement(1, 2, 6);
        matrix.setElement(2, 0, 7);
        matrix.setElement(2, 1, 8);
        matrix.setElement(2, 2, 9);
        // Print the matrix
        matrix.printMatrix();
    }
}

