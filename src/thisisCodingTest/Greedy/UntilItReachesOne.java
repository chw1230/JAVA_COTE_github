package thisisCodingTest.Greedy;

import java.util.Scanner;
// 1이 될때 까지
public class UntilItReachesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt=0;
        while (n != 1){
            if (n % k == 0) {
                n /= k;
            }else{
                n -= 1;
            }
            cnt++;

        }
        System.out.println(cnt);
    }
}
