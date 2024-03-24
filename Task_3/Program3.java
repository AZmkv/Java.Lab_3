package Task_3;

import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(5);
        System.out.println("Вихідна матриця:");
        printMatrix(matrix);

        int[][] updatedMatrix = removeRow(matrix, 2);
        System.out.println("\nМатриця після видалення 3-го рядка:");
        printMatrix(updatedMatrix);
    }

    // Функція для створення квадратної матриці з випадковими числами
    public static int[][] createRandomMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(10); // Генеруємо випадкове число від 0 до 9
            }
        }
        return matrix;
    }

    // Функція для видалення одного рядка з матриці
    public static int[][] removeRow(int[][] matrix, int rowIndex) {
        int[][] updatedMatrix = new int[matrix.length - 1][matrix.length];
        for (int i = 0, k = 0; i < matrix.length; i++) {
            if (i != rowIndex) {
                updatedMatrix[k++] = matrix[i];
            }
        }
        // Заповнюємо останній рядок нулями
        for (int i = 0; i < matrix.length; i++) {
            updatedMatrix[matrix.length - 1][i] = 0;
        }
        return updatedMatrix;
    }

    // Функція для виведення матриці на екран
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
