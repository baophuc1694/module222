package baitap;

public class hienthisonguyentodautien {
    public static boolean primeCheck(int a){
        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        int N = 2;
        while (count < num){
            if (primeCheck(N)){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }

}
