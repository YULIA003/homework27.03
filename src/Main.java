import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double[] amountOnMonday = {45678, 1023, 56856, 90877, 38765};
        double sum = 0.0;
        for (double v : amountOnMonday) {
            sum += v;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задание 2");
        double min = Double.MAX_EXPONENT;
        double max = Double.MIN_EXPONENT;
        for (double payment: amountOnMonday) {
            if (min > payment) {
                min = payment;
            }
            if (max < payment) {
                max = payment;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей. Минимальная сумма трат за неделю составила " + min + " рублей");
        System.out.println("Задание 3");
        double average = sum / amountOnMonday.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
            }
        }

