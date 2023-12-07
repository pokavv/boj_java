package TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tc_24263 {

    public static void main(String[] args) throws IOException {
        /**
         * MenOfPassion(A[], n) {
         *     sum <- 0;
         *     for i <- 1 to n
         *         sum <- sum + A[i]; # 코드1
         *     return sum;
         * }
         */

        // O(n) : 직선적 시간 -> 문제를 해결하기 위한 단계의 수와 입력값 n이 1대1 관계를 가짐
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n);
        System.out.println(1);
    }
}
