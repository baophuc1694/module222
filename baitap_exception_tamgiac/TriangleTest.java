package baitap_exception_tamgiac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {
    private static void Triangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh x: ");
            int x = scanner.nextInt();
            System.out.println("Nhập cạnh y: ");
            int y = scanner.nextInt();
            System.out.println("Nhập cạnh z: ");
            int z = scanner.nextInt();
            if (x > 0 && y > 0 && z > 0) {
                System.out.println("Tam giác có cạnh x = " + x + "\t" + "cạnh y = " + y + "\t" + "cạnh z = " + z + "\t");
            } else throw new IllegalTriangleException("Giá trị của cạnh phải > 0, nhập lại.");
            if (x + y > z && y + z > x && x + z > y) {
                System.out.println(" Tổng ba cạnh là: " + (x + y + z));
            } else throw new IllegalTriangleException("Tổng của 2 cạnh phải lớn hơn cạnh còn lại.");
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Triangle();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
