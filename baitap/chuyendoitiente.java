package baitap;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double VND;
        double USD;
        System.out.println("Nhập USD: ");
        Scanner scanner = new Scanner(System.in);
        USD =scanner.nextInt();
        VND = USD * 23000;
        System.out.println("VND: " + VND);
        System.out.println("Nhập VND: ");
        Scanner scanner1 = new Scanner(System.in);
        VND = scanner1.nextInt();
        USD = VND / 23000;
        System.out.println("USD: " + USD);
    }
}
