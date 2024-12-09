package lab1;

/*C5 = 1 - C = B^T (транспонування)
C7 = 1 - byte
C11 = 3 - Обчислити суму найбільших елементів кожного рядка матриці*/

/**
 * The {@code Main} class serves as the entry point of the program.
 * It uses the {@code MatrixHandler} class to:
 * <ul>
 *     <li>Read a matrix from user input.</li>
 *     <li>Transpose the matrix.</li>
 *     <li>Calculate the sum of the maximum elements in each row of the transposed matrix.</li>
 *     <li>Print the results to the console.</li>
 * </ul>
 **/
public class Main {
    /**
     * The main method is the entry point of the program.
     *
     * @param args the command line arguments (not used).
     **/
    public static void main(String[] args) {
        MatrixHandler matrixHandler = new MatrixHandler();
        matrixHandler.outputTransposedMatrixAndMaxValueInRowSum();
    }
}
