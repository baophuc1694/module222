package baitap_mang;

import java.util.Scanner;

public class themphantuvaomang {
    public static int[] insertElement(int newValue, int index, int arr[]){
        int newArray[] = new int[arr.length+1];
        for (int i = 0; i <index; i++){
            newArray[i] = arr[i];
        }
        for (int i = arr.length; i > index; i--){
            newArray[i] = arr[i - 1];
        }
        newArray[index] = newValue;
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + "\t");
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[]= {3, 5, 7 ,9};
        System.out.println("Nhập một số bạn  muốn thêm vào: ");
        int input = scanner.nextInt();
        System.out.println("Nhập vị trí bạn muốn thêm vào: ");
        int pos = scanner.nextInt();
        insertElement(input,pos,array);
    }
}
