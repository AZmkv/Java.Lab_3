package Task_2;

public class Program {
    public static void main(String[] args) {
        int[] array = new int[100];
        int range = 50;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (2 * range + 1)) - range; // Генеруємо випадкові числа в діапазоні [-50, 50]
        }

        double maxAverage = 0;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int sum = array[i];
                int count = 1;
                int j = i + 1;
                while (j < array.length && array[j] < 0) {
                    sum += array[j];
                    count++;
                    j++;
                }
                double average = (double) sum / count;
                if (Math.abs(average) > Math.abs(maxAverage)) {
                    maxAverage = average;
                    startIndex = i;
                    endIndex = j - 1;
                }
                i = j - 1; // Пропускаємо оброблені від'ємні числа
            }
        }

        System.out.println("Послідовність з найбільшим абсолютним значенням середнього арифметичного:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nСереднє арифметичне цієї послідовності: " + maxAverage);
    }
}
