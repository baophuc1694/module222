package thuchanh;

import javax.swing.*;
import java.util.Scanner;

public class kiemtrasonguyento {
    private static boolean check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int num = scanner.nextInt();
        if (num < 2){
            System.out.println(num + "Không phải là số nguyên tố.");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }
//        boolean check = scanner.nextBoolean();
        if (check)
            System.out.println(num + "là số nguyên tố.");
        else
            System.out.println(num + "Không phải số nguyên tố");
    }
}
