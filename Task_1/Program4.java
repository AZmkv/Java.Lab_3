package Task_1;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        double[] array = {1.5, -2.0, 3.2, -4.8, 5.6, 0.9, -1.1, 2.4, -3.5};

        // Обчислення суми елементів масиву з непарними номерами
        double sumOddIndex = 0;
        for (int i = 1; i < array.length; i += 2) {
            sumOddIndex += array[i];
        }
        System.out.println("Сума елементів масиву з непарними номерами: " + sumOddIndex);

        // Знаходження індексів першого і останнього від'ємного елемента
        int firstNegativeIndex = -1;
        int lastNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
                lastNegativeIndex = i;
            }
        }

        // Обчислення суми елементів масиву, розташованих між першим і останнім від'ємними елементами
        double sumBetweenNegatives = 0;
        if (firstNegativeIndex != -1 && lastNegativeIndex != -1 && firstNegativeIndex != lastNegativeIndex) {
            for (int i = firstNegativeIndex + 1; i < lastNegativeIndex; i++) {
                sumBetweenNegatives += array[i];
            }
        }
        System.out.println("Сума елементів масиву, розташованих між першим і останнім від'ємними елементами: " + sumBetweenNegatives);

        // Стиск масиву
        double[] compressedArray = Arrays.stream(array)
                .filter(num -> Math.abs(num) > 1)
                .toArray();

        // Заповнення нулями елементів, що залишилися
        for (int i = compressedArray.length; i < array.length; i++) {
            compressedArray[i] = 0;
        }

        // Виведення стиснутого масиву
        System.out.println("Стиснутий масив: " + Arrays.toString(compressedArray));
    }
}
