package thisisCodingTest.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ11508 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if ((i+1) % 3 == 0) {
                sum -= arr[i];
            }
        }
        System.out.println(sum);
    }
}
