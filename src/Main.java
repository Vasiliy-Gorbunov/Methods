import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        enterCurrentYear();
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
}