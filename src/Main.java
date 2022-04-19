public class Main {
    //Задание 1

    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        int summ = 0;
        for (int a = 0; a < arr.length; a++) {
            summ += arr[a];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        // Задание 2
        int maxwage = -1;
        int minwage = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minwage) {
                minwage = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxwage) {
                maxwage = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат составила " + maxwage + " рублей");
        System.out.println("Минимальная сумма трат составила " + minwage + " рублей");

        //Задание 3
        double average = 0;
        for (double element : arr) {
            average += element / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание4

        char[] reversName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};{
            for (int i = reversName.length-1;i>=0;i--) {
                System.out.print(reversName[i]);

            }
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

