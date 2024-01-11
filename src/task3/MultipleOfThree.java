package task3;

public class MultipleOfThree {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 12, 30, 33, 333};

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}