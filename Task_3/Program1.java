package Task_3;

public class Program1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, 3, -4},
            {5, 6, -7, 8},
            {-9, 10, 11, 12}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Масив для зберігання кількості від'ємних елементів у кожному стовпці
        int[] negativeCounts = new int[cols];

        // Перебираємо кожен стовпець і підраховуємо кількість від'ємних елементів
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] < 0) {
                    negativeCounts[j]++;
                }
            }
        }

        // Надрукуємо кількість від'ємних елементів у кожному стовпці
        for (int j = 0; j < cols; j++) {
            System.out.println("Стовпець " + (j + 1) + ": " + negativeCounts[j] + " від'ємних елементів");
        }
    }
}
