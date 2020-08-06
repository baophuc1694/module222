package thuchanh_mang;

import java.util.Scanner;

public class chuyendoinhietdo {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1.Chuyển độ F sang độ C");
            System.out.println("2.Chuyển độ C sang độ F");
            System.out.println("3.Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F khi chuyển sang độ C là:  " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập số độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C khi chuyển sang độ F là: " + celsiusToFahrenheit(celsius));
                    break;
                case 3:
                    System.exit(3);
            }
        } while (choice != 3);

    }
}
