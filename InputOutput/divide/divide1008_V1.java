package InputOutput.divide;

import java.util.Scanner;

// Scanner 사용, 반드시 double 타입으로 출력
public class divide1008_V1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println(a / b);

        scanner.close();
    }
}
