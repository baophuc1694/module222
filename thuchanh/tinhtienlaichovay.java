package thuchanh;

import java.util.Scanner;

public class tinhtienlaichovay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double intersetRate = 1.0;
        System.out.println("Nhập số tiền muốn gởi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng muốn gởi: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất hằng năm theo %: ");
        intersetRate = scanner.nextDouble();
        double totalInterset = 0;
        for (int i = 0; i < month; i++){
            totalInterset += money * (intersetRate/100)/12 * month;
            System.out.println("Tổng lãi suất: " + totalInterset);
        }
    }
}
