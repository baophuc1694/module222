package thuchanh_huongdoituong;

import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle abc = new Rectangle(width, height);
        System.out.println("Kết quả: " + abc.getPerimeter());
        System.out.println("hình chữ nhật của ban\n " + abc.display());
        System.out.println("Diện tích hình chữ nhât: " + abc.getArea());
    }
}
