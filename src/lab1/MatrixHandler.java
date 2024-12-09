package lab1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixHandler {

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

    private byte[][] getTransposedMatrix(byte[][] matrix) {
        byte[][] transposedMatrix = new byte[matrix[0].length][matrix.length];
        for (int row = 0; row < transposedMatrix.length; row++) {
            for (int column = 0; column < transposedMatrix[0].length; column++) {
                transposedMatrix[row][column] = matrix[column][row];
            }
        }
        return transposedMatrix;
    }

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

    private void printMatrix(byte[][] matrix) {
        for (byte[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
