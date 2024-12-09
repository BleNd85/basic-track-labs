package lab1;

/*C5 = 1 - C = B^T (транспонування)
C7 = 1 - byte
C11 = 3 - Обчислити суму найбільших елементів кожного рядка матриці*/
public class Main {
    public static void main(String[] args) {
        MatrixHandler matrixHandler = new MatrixHandler();
        matrixHandler.outputTransposedMatrixAndMaxValueInRowSum();
    }
}
