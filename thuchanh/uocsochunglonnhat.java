package thuchanh;

import java.util.Scanner;

public class uocsochunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = scanner.nextInt();
        System.out.println("Nhập b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("ước chung lớn nhất là : " + a);
    }

}
