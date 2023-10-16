package OneDimensionalArray.minmax;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int idx = 0;
        int[] arr = new int[n];
        while (st.hasMoreTokens()) {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}
