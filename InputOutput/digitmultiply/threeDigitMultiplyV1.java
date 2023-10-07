package InputOutput.digitmultiply;

import java.util.Scanner;

// 2588 boj
// Scanner 사용 + charAt() 사용
public class threeDigitMultiplyV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = scanner.next();

        scanner.close();

        // charAt() : 각 자리수를 참조, 즉 인덱스를 참조하여 아스키코드 값 반환
        // '0' 은 아스키코드 값으로 48, 따라서 '0' 을 빼주면 원래 숫자 그대로의 값이 나옴 (char - char = int)
        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
