package InputOutput.multiply;

// Scanner 사용

import java.util.Scanner;

public class multiply10998_V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a * b);

        scanner.close();
    }
}
