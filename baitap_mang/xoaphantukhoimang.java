package baitap_mang;

import java.util.Scanner;

public class xoaphantukhoimang {
    public static int[] removeElement(int arr[], int pos){
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }
        for (int i = pos; i < newArr.length; i++){
            newArr[i] = arr[i + 1];
        }
        System.out.println("Phần tử muốn xoá");
        System.out.println("New array: ");
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i] + "\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] ={3, 4, 5, 7, 9 };
        System.out.println("Nhập số bạn muốn xoá: ");
        int input = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == input){
                removeElement(array, i);
                check = true;
            }
        }
        if (!check){
            System.out.println("Không thể tìm thấy phần tử");
        }
    }
}
