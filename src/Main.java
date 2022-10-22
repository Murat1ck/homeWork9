import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //generateRandomArray();
        task();
    }

        // int[] arr = generateRandomArray();

         public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task () {
            int[] arr = generateRandomArray();
            int money = 0;
            int minMoney = 0;
            int maxMoney = 0;
            int averageValue = 0;
            for (int value : arr) {
                money += value;
            }
            for (int element : arr) {
                if (element < minMoney) {
                    minMoney = element;
                } else if (element > maxMoney) {
                    maxMoney = element;
                }
            }
            averageValue = money / arr.length;


            System.out.println("Задание №1");
            System.out.printf("Сумма трат за месяц составила %d рублей \n", money);
            System.out.println("Задание №2");
            System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей \n", maxMoney, minMoney);
            System.out.println("Задание №3");
            System.out.printf("Средняя сумма трат за месяц составила %d рублей \n", averageValue);
        }
        //ВОПРОС: Каким образом я могу всё это вывести в консоль??? выводится что код выполнен но без soutf


        public static void task4 () {
            System.out.println("Задание №5");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.println(reverseFullName[i]);
            }
        }
    }

