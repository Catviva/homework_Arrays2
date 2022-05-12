public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

        }

    // Exercise 1

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составляет " + sum + " рублей");

        // Exercise 2

        int minDay = arr[0];
        int maxDay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minDay) {
                minDay = arr[i];
            }

        }
        System.out.println("Минимальная сумма затрат за день составила " + minDay + " рублей");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxDay) ;
            {
                maxDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма затрат за день составила " + maxDay + " рублей");

        // Exercise 3


        double averageAmount = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        // Exercise 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            
        }
    }}












