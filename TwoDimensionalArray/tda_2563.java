package TwoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tda_2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int paperArea = 0;
        int paperNum = Integer.parseInt(br.readLine());
        boolean[][] graph = new boolean[101][101];

        for (int i = 0; i < paperNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // (x, y) ~ (x+9, y+9) 의 영역을 하나씩 체크 후 총 넓이에 더함
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!graph[j][k]) {
                        graph[j][k] = true;
                        paperArea++;
                    }
                }
            }
        }

        System.out.print(paperArea);
    }
}
