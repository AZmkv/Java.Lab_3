package Task_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {
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
        
        // Визначення кількості різних чисел у масиві
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < size; i++) {
            uniqueNumbers.add(array[i]);
        }
        int differentNumbersCount = uniqueNumbers.size();
        
        // Виведення результату
        System.out.println("Кількість різних чисел у масиві: " + differentNumbersCount);
        
        scanner.close();
    }
}
