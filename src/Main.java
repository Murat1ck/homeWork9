import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        generateRandomArray();
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int money = 0;
        int minMoney = 99000;
        int maxMoney = 201000;
        int averageValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            money += arr[i];
            if (arr[i] > minMoney) {
                minMoney = arr[i];
            }
            if (arr[i] < maxMoney) {
                maxMoney = arr[i];
            }
            averageValue += arr[i] / 30;


        }
        System.out.println("Задание №1");
        System.out.printf("Сумма трат за месяц составила %d рублей \n", money);
        System.out.println("Задание №2");
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", maxMoney, minMoney);
        System.out.println("Задание №3");
        System.out.printf("Средняя сумма трат за месяц составила %d рублей \n", averageValue);
        return arr;
    }
    public static void task4() {
        System.out.println("Задание №5");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //не понял как это выполнить. Прошу разъяснений
    }
}