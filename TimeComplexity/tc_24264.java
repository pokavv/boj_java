package TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tc_24264 {

    public static void main(String[] args) throws IOException {
        /**
         * MenOfPassion(A[], n) {
         *     sum <- 0;
         *     for i <- 1 to n
         *         for j <- 1 to n
         *             sum <- sum + A[i] × A[j]; # 코드1
         *     return sum;
         * }
         */

        // O(n^2) : 2차 시간 -> 문제를 해결하기 위한 단계의 수는 입력값 n의 제곱
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(n * n);
        System.out.println(2);
    }
}
