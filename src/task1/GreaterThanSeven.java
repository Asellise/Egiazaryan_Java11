package task1;

import java.util.Scanner;

public class GreaterThanSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}

// Не обрабатывались случаи, когда число меньше либо рано 7, тк в задании жтого не было указано