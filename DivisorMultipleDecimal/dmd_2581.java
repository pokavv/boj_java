package DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmd_2581 {

    public static boolean primeNums[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        primeNums = new boolean[n + 1];
        getPrime();

        for (int i = m; i <= n; i++) {
            if (primeNums[i] == false) {
                sum += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    // 에라토스테네스 체 알고리즘 (소수 구하는 알고리즘 중 가장 일반적인 알고리즘이다 기억하자)
    public static void getPrime() {
        primeNums[0] = true;
        primeNums[1] = true;

        for (int i = 2; i <= Math.sqrt(primeNums.length); i++) {
            if (primeNums[i]) {
                continue;
            }
            for (int j = i * i; j < primeNums.length; j += i) {
                primeNums[j] = true;
            }
        }
    }
}
