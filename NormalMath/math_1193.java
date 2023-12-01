package NormalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cross_count = 1;
        int prev_count = 0;

        while (true) {
            if (n <= prev_count + cross_count) {
                if (cross_count % 2 == 1) {
                    System.out.println((cross_count - (n - prev_count - 1)) + "/" + (n - prev_count));
                    break;
                } else {
                    System.out.println((n - prev_count) + "/" + (cross_count - (n - prev_count - 1)));
                    break;
                }
            } else {
                prev_count += cross_count;
                cross_count++;
            }
        }
    }
}
