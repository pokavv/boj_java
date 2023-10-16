package OneDimensionalArray.putballin;

import java.io.*;
import java.util.StringTokenizer;

public class PutBallIn {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken()); // num1 번 바구니부터
            int num2 = Integer.parseInt(st.nextToken()); // num2 번 바구니까지
            int num3 = Integer.parseInt(st.nextToken()); // num3 번 공을 넣는다.

            for (int j = num1 - 1; j < num2; j++) {
                arr[j] = num3;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
