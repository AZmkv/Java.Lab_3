package Task_1;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        double[] array = {3.0, -2.5, 0.0, 1.5, 0.0, -4.0};

        int countZeros = 0;
        double minElement = array[0];
        int minElementIndex = 0;
        double sumAfterMin = 0.0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0.0) {
                countZeros++;
            }

            if (array[i] < minElement) {
                minElement = array[i];
                minElementIndex = i;
            }
        }

        for (int i = minElementIndex + 1; i < array.length; i++) {
            sumAfterMin += array[i];
        }

        Arrays.sort(array, (a, b) -> Double.compare(Math.abs(a), Math.abs(b)));

        System.out.println("Кількість елементів, рівних 0: " + countZeros);
        System.out.println("Сума елементів після мінімального елемента: " + sumAfterMin);
        System.out.println("Відсортований масив за зростанням модулів елементів: " + Arrays.toString(array));
    }
}
