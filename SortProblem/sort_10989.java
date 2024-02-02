package SortProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort_10989 {

    /**
     * 1 <= n <= 10,000,000
     * data < 10,000
     *
     * -> 카운팅 정렬 사용
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];
        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        // 자연수 : 1 ~ 10000
        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }

        System.out.println(sb);
    }
}
