package InputOutput.plus;

import java.util.Scanner;

// Scanner 사용

public class plus1000_V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A + B);

        scanner.close();
    }
}
