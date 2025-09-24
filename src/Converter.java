import java.util.Scanner;

public class Converter {

    private static final double USD_RATE = 90.91;
    private static final double EUR_RATE = 98.00;
    private static final double CNY_RATE = 12.60;
    private static final double VND_RATE = 0.0036;
    private static final double KZT_RATE = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("___Конвертер из рублей___");
        System.out.println("Введите сумму в российских рублях:");
        System.out.print("Сумма: ");

        double rubles;
        try {
            rubles = Double.parseDouble(scanner.nextLine().trim());
            if (rubles < 0) {
                System.out.println("Сумма не может быть отрицательной.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите корректное число.");
            return;
        }

        System.out.println("\nРезультат конвертации:");
        System.out.printf("%.2f RUB =\n", rubles);
        System.out.printf("  %.2f USD \n", rubles / USD_RATE);
        System.out.printf("  %.2f EUR \n", rubles / EUR_RATE);
        System.out.printf("  %.2f CNY \n", rubles / CNY_RATE);
        System.out.printf("  %.2f VND \n", rubles / VND_RATE);
        System.out.printf("  %.2f KZT \n", rubles / KZT_RATE);

        scanner.close();
    }
}