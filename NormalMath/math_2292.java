package NormalMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * n = 1 인 벌집 개수는 1, count 는 1
 * n = 2~7 인 벌집 개수는 6, count 는 2
 * n = 8~19 인 벌집 개수는 12, count 는 3
 * n = 20~37 인 벌집 개수는 18, count 는 4
 * n = 38~61 인 벌집 개수는 24, count 는 5
 */
public class math_2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) {
                range += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
