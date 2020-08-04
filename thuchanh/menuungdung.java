package thuchanh;

import java.util.Scanner;

public class menuungdung {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Hình tam giác: ");
        System.out.println("2. Hình vuông: ");
        System.out.println("3. Hình chữ nhật: ");
        System.out.println("4. Exit");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Hình tam giác");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Hình vuông");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 3:
                System.out.println("Hình chữ nhật");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("k có trong menu");
        }
        while (choice != 0){

        }
    }
}
