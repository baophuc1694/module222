package thuchanh;
import java.util.Scanner;

public class cannangcothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Nhập số cân nặng của cơ thê: ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của cơ thê: ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.println("Chỉ số bmi của bạn là: " + bmi);
        if (bmi < 18){
            System.out.println("Bạn quá gầy");
        }else if(bmi < 25.0){
            System.out.println("Bạn bình thường");
        }else if (bmi < 30.0){
            System.out.println("Bạn hơi béo một tí, không chi đâu, vẫn còn ok đó");
        }else {
            System.out.println("Bạn quá chi là béo rồi, béo đến nỗi thở còn không nổi kìa, đừng có ún tà tữa nữa");
        }
    }
}
