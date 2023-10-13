package ConditionalStatement.comparenums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDices {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        // 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
        // 3개의 변수가 모두 같은 경우
        else if (a == b && a == c) {
            System.out.println(10000 + a * 1000);
        }
        // a 가 b 혹은 c 랑만 같은 경우
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        }
        // b 가 c 랑 같은 경우
        else {
            System.out.println(1000 + b * 100);
        }
    }
}
