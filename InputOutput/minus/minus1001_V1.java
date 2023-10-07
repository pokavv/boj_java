package InputOutput.minus;

import java.util.Scanner;

// Scanner 사용

public class minus1001_V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a - b);

        scanner.close();
    }
}
