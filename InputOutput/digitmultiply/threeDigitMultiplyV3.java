package InputOutput.digitmultiply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2588 boj
// toCharArray() 를 사용하여 문자열로 입력받음과 동시에 char 배열에 각 단어를 담음
public class threeDigitMultiplyV3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        // toCharArray() 라는 문자열을 char 배열 형태로 반환해주는 메소드
        char[] bCharArray = b.toCharArray();

        System.out.println(a * (bCharArray[2] - '0'));
        System.out.println(a * (bCharArray[1] - '0'));
        System.out.println(a * (bCharArray[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
