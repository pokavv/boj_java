package OneDimensionalArray.count;

import java.io.*;
import java.util.StringTokenizer;

public class Count {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 정수 n
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 배열 arr[]
        }

        int cnt = 0;
        int v = Integer.parseInt(br.readLine()); // 정수 v
        for (int j = 0; j < arr.length; j++) {
            if (v == arr[j]) {
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
        bw.flush();
        bw.close();
    }
}
