package baitap_mang;

import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của mảng 1: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Nhập phần tử thứ" + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị của mảng 2: ");
        for (int i =  0; i < arr2.length; i++){
            System.out.println("Nhập phần tử thứ" + (i + 1) + ":");
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Đang tiến hành gộp mảng");
        int [] arr3 = new int[9];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for (int i =0; i < arr2.length;i++){
            arr3[i] = arr2[i];
        }
        System.out.println("Mảng mới vừa gộp là: ");
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i] + "\t");
        }
    }
}
