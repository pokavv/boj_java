package InputOutput.plusplus;

import java.util.Scanner;

// 11382 boj
// Scanner 사용
public class doublePlusV1 {

    /*
    문제 포인트 : 1 ≤ A, B, C ≤ 1000000000000

    java 정수 자료형 범위
    1. byte : -128 ~ 127
    2. short : -32768 ~ 32767
    3. int : -2147483648 ~ 2147483647
    4. long : -9223372036854775808 ~ 9223372036854775807
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int 를 사용하면 범위 제한
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(a + b + c);
    }
}
