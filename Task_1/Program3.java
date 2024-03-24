package Task_1;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Введення розміру масиву
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Введення елементів масиву
        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Обчислення добутку елементів масиву з парними номерами
        int product = 1;
        for (int i = 0; i < size; i += 2) {
            product *= array[i];
        }
        System.out.println("Добуток елементів масиву з парними номерами: " + product);
        
        // Знаходження першого і останнього нульового елементів
        int firstZeroIndex = -1;
        int lastZeroIndex = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    lastZeroIndex = i;
                }
            }
        }
        
        // Обчислення суми елементів масиву, розташованих між першим і останнім нульовими елементами
        int sum = 0;
        if (firstZeroIndex != -1 && lastZeroIndex != -1) {
            for (int i = firstZeroIndex + 1; i < lastZeroIndex; i++) {
                sum += array[i];
            }
        }
        System.out.println("Сума елементів масиву, розташованих між першим і останнім нульовими елементами: " + sum);
        
        // Перетворення масиву
        int positiveIndex = 0;
        int negativeIndex = size - 1;
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                resultArray[positiveIndex++] = array[i];
            } else {
                resultArray[negativeIndex--] = array[i];
            }
        }
        
        // Виведення результату перетворення масиву
        System.out.print("Перетворений масив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(resultArray[i] + " ");
        }
        
        scanner.close();
    }
}
