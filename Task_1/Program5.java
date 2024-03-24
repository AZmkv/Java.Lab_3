package Task_1;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        double[] array = {3.5, -1.2, 0.0, 2.8, -4.1, 5.2, 0.0, -3.3};

        // Знаходження максимального за модулем елемента масиву
        double maxAbsoluteValue = Math.abs(array[0]);
        for (int i = 1; i < array.length; i++) {
            double absoluteValue = Math.abs(array[i]);
            if (absoluteValue > maxAbsoluteValue) {
                maxAbsoluteValue = absoluteValue;
            }
        }
        System.out.println("Максимальний за модулем елемент масиву: " + maxAbsoluteValue);

        // Знаходження індексів першого і другого додатніх елементів
        int firstPositiveIndex = -1;
        int secondPositiveIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (firstPositiveIndex == -1) {
                    firstPositiveIndex = i;
                } else {
                    secondPositiveIndex = i;
                    break;
                }
            }
        }

        // Обчислення суми елементів масиву, розташованих між першим і другим додатними елементами
        double sumBetweenPositives = 0;
        if (firstPositiveIndex != -1 && secondPositiveIndex != -1) {
            for (int i = firstPositiveIndex + 1; i < secondPositiveIndex; i++) {
                sumBetweenPositives += array[i];
            }
        }
        System.out.println("Сума елементів масиву, розташованих між першим і другим додатними елементами: " + sumBetweenPositives);

        // Перетворення масиву, щоб елементи, рівні нулю, розташовувалися після всіх інших елементів
        Arrays.sort(array);
        System.out.println("Перетворений масив: " + Arrays.toString(array));
    }
}
