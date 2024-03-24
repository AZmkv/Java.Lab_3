package Task_1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Введення числа A
        System.out.print("Введіть число A: ");
        int A = scanner.nextInt();
        
        // Введення розміру масиву
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Введення елементів масиву
        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Підрахунок кількості елементів більших за A
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > A) {
                count++;
            }
        }
        
        // Виведення результату
        System.out.println("Кількість елементів масиву, більших за " + A + ": " + count);
        
        scanner.close();
    }
}