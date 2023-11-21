package TwoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tda_2566 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2차원 배열 생성 및 값 입력
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < strArr.length; j++) {
                arr[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        // 2차원 배열 조회하며 최댓값 찾기
        int max = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((row + 1) + " " + (column + 1));
    }
}
