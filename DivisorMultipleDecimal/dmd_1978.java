package DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmd_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // st.hasMoreTokens 때문에 따로 N 을 입력받지 않아도 됨
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
