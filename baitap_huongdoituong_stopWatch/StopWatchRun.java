package baitap_huongdoituong_stopWatch;

import java.util.Random;

public class StopWatchRun {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = randomIntegers(100000);
        stopWatch.start();
        insertionSort(array);
        stopWatch.stop();
        System.out.printf("%d milliseconds !", stopWatch.getElapsedTime());
    }
    public static int[] randomIntegers(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }
        return array;
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
