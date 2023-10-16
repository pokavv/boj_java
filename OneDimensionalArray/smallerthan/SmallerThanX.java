package OneDimensionalArray.smallerthan;

import java.io.*;
import java.util.StringTokenizer;

public class SmallerThanX {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());

            if (val < x) {
                sb.append(val).append(" ");
            }
        }

        System.out.println(sb);
    }
}
