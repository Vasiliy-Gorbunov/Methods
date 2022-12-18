import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //enterCurrentYear();
        task2();
    }

    public static void enterCurrentYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int yearNow = in.nextInt();
        task1(yearNow);
    }

    public static void task1(int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.printf("%d год - високосный!", currentYear);
        } else System.out.printf("%d год - не високосный!", currentYear);
    }

    public static int enterClientOS() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nВаша ОС (0 - iOS, 1 - Android): ");
        int clientOS = in.nextInt();
        return clientOS;
    }

    public static int getClientDeviceYear() {
        int currentYear = LocalDate.now().getYear();
        return currentYear;
    }

    public static void task2() {
        if (getClientDeviceYear() >= 2015) {
            if (enterClientOS() == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (enterClientOS() == 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }
    }

}