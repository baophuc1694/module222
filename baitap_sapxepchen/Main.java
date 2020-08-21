package baitap_sapxepchen;

public class Main {
    static int[] list = {24, 6, 94, 18, 20, 19, 10};
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int j;
            for (j = i -1; j > 0 && list[j] > currentElement; j--){
                list[j+1] = list[j];
            }
            list[j+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i] + "\t");
        }
    }
}
