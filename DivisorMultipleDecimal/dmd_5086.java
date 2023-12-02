package DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmd_5086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int m = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) {
                break;
            }

            if (m % n == 0) {
                System.out.println("factor");
            } else if (n % m == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
