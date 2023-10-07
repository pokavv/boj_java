package InputOutput.fbo;

import java.util.Scanner;

// 10869 boj
// Scanner 사용
public class fourBasicOperationV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        scanner.close();
    }
}
