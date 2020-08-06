package thuchanh_mang;

import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] student = {"Phuc", "Phuong", "Phong", "My", "Bao", "Nhi", "Duong", "Phat", "Hieu", "Chien"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String input_name = scanner.nextLine();
        boolean isExit= false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên trong danh sách " + input_name + "là: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("Không tìm thấy" + input_name + "trong danh sách");
    }


}
