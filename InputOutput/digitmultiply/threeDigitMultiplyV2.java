package InputOutput.digitmultiply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2588 boj
// BufferedReader 사용 + StringBuilder() 사용 + 수학적 접근
public class threeDigitMultiplyV2 {

    /*
    - b 에 들어오는 입력값을 각 자릿수 별로 얻어온다.
    - b 의 각 자릿수 값은 10 으로 나눈 값의 나머지
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder builder = new StringBuilder();

        builder.append(a * (b % 10));
        builder.append('\n');
        builder.append(a * ((b % 100) / 10));
        builder.append('\n');
        builder.append(a * (b / 100));
        builder.append('\n');
        builder.append(a * b);

        System.out.println(builder);
    }
}
