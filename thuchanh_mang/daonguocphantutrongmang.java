package thuchanh_mang;

import java.util.Scanner;

public class daonguocphantutrongmang {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước vượt quá 20");
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhập phần tử" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Phần tử của mảng: ", " ");
        for (int j = 0;  j < array.length; j++){
            System.out.println(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Phần tử đảo ngược: "," " );
        for (int j  = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }
    }
}
