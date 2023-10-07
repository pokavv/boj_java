package InputOutput.fbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10869 boj
// BufferedReader + split() 사용
public class fourBasicOperationV2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
