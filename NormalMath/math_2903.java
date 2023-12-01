package NormalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * n번 반복해서 n번째의 점의 개수를 출력
 * -> 규칙성: n번 실행하면 (1 + 2의 n제곱) 의 제곱
 */
public class math_2903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // Math.pow 사용
        System.out.println((int)Math.pow(Math.pow(2, n) + 1 , 2));
    }
}
