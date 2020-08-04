package lenear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a: ");
        a = scanner.nextDouble();
        System.out.println("b: ");
        b = scanner.nextDouble();
        System.out.println("c: ");
        c= scanner.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass width x = %f!\n", answer);
            }else {
            if (b == 0){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }
        }
    }

