package lab1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The {@code MatrixHandler} class provides methods for processing matrix entered by the user,
 * including transposing, calculating the sum of the maximum values in each row
 * and printing matrices to the console.
 */
public class MatrixHandler {
    /**
     * Calls all matrix methods:
     * <ul>
     *     <li>Reads a matrix from user input.</li>
     *     <li>Prints the original matrix.</li>
     *     <li>Transposes the matrix and prints it.</li>
     *     <li>Calculates and prints the sum of the maximum values in each row of the transposed matrix.</li>
     * </ul>
     * <p>
     * Handles the following exceptions:
     * *<ul>
     *     <li>{@code NegativeArraySizeException} if the matrix dimensions are negative.</li>
     *     <li>{@code InputMismatchException} if the matrix elements are not valid byte values.</li>
     * </ul>
     *
     * @throws NegativeArraySizeException if the user provides negative dimensions for the matrix.
     * @throws InputMismatchException     if the matrix elements are not valid byte values.
     */
    public void outputTransposedMatrixAndMaxValueInRowSum() {
        try {
            byte[][] matrix = getMatrix();
            System.out.println("----------------------Matrix----------------------");
            printMatrix(matrix);
            System.out.println("----------------------Transposed Matrix----------------------");
            byte[][] transposedMatrix = getTransposedMatrix(matrix);
            printMatrix(transposedMatrix);
            System.out.println("----------------------Sum of maximum values in a row----------------------");
            System.out.println(getSumOfMaxValuesInRow(transposedMatrix));
        } catch (NegativeArraySizeException negativeArraySizeException) {
            System.out.println("Wrong array size. Rows and columns must be positive integers.");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Wrong value. Matrix values must be integers in range between -128 and 127.");
        }
    }

    /**
     * Reads a matrix from user input.
     *
     * @return matrix of type {@code byte} representing the matrix.
     */
    private byte[][] getMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix, rows and columns must be positive integers.");
        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        System.out.println("Enter columns:");
        int columns = sc.nextInt();
        byte[][] matrix = new byte[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.printf("Enter element [%d][%d]:\n", row + 1, column + 1);
                matrix[row][column] = sc.nextByte();
            }
        }
        return matrix;
    }

    /**
     * Transposes the given matrix.
     *
     * @param matrix a matrix (2D array) of type {@code byte} representing the matrix that will be transposed.
     * @return a matrix (2D array) of type {@code byte} representing the transposed matrix.
     */
    private byte[][] getTransposedMatrix(byte[][] matrix) {
        byte[][] transposedMatrix = new byte[matrix[0].length][matrix.length];
        for (int row = 0; row < transposedMatrix.length; row++) {
            for (int column = 0; column < transposedMatrix[0].length; column++) {
                transposedMatrix[row][column] = matrix[column][row];
            }
        }
        return transposedMatrix;
    }

    /**
     * Calculates the sum of the maximum values in each row of the matrix.
     *
     * @param matrix a 2D array of type {@code byte} representing the matrix in whose rows calculation of maximum value will happen.
     * @return the sum of the maximum values in each row.
     */
    private int getSumOfMaxValuesInRow(byte[][] matrix) {
        int sumOfMaxValues = 0;
        for (byte[] row : matrix) {
            byte maxInRow = Byte.MIN_VALUE;
            for (byte element : row) {
                if (element > maxInRow) {
                    maxInRow = element;
                }
            }
            sumOfMaxValues += maxInRow;
        }
        return sumOfMaxValues;
    }

    /**
     * Prints the given matrix to the console.
     *
     * @param matrix matrix (2D array) of type {@code byte} representing the matrix to print.
     */
    private void printMatrix(byte[][] matrix) {
        for (byte[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
