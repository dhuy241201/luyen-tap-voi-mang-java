import java.util.Scanner;

public class Th_chuongTrinh_chuyenDoi_nhietDo {
    public static void main(String[] args) {
        int choice;
        double value;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Nhập giá trị F: ");
                    value = scanner.nextDouble();
                    System.out.print("Kết quả: ");
                    System.out.println(value+"°F = "+FahrenheittoCelsius(value)+"°C\n");
                    break;
                case 2:
                    System.out.print("Nhập giá trị C: ");
                    value = scanner.nextDouble();
                    System.out.print("Kết quả: ");
                    System.out.println(value+"°C = "+CelsiustoFahrenheit(value)+"°F\n");
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc");
            }
        }while (choice != 0);
    }

    public static double FahrenheittoCelsius(double celsisus) {
        return (5.0 / 9) * (celsisus - 32);
    }

    public static double CelsiustoFahrenheit(double celsisus) {
        return (9*celsisus)/5 + 32;
    }
}