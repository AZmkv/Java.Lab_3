package Task_3;

public class Program2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 2},
            {9, 5, 1},
            {4, 6, 8}
        };

        int minElement = matrix[0][0];
        int minRowIndex = 0;
        int minColIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minRowIndex = i;
                    minColIndex = j;
                }
            }
        }

        System.out.println("Найменший елемент матриці: " + minElement);
        System.out.println("Його індекси: рядок " + minRowIndex + ", стовпець " + minColIndex);
    }
}
