package SortProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort_2750 {

    /*
     - 선택정렬
     첫 번째 인덱스부터 시작하여 뒤의 인덱스들의 값들과 비교하여 최솟값들을 차곡차곡 쌓아나가는 방법
     */
    public static void selectSort(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int val : arr) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }

    /*
     - Arrays.sort()
     */
    public static void arraysSort(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        for (int val : arr) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }

    /*
     - 카운팅 정렬
     주어진 배열의 값 범위가 작은 경우 빠른 속도를 갖는 정렬 알고리즘이다.
     최댓값과 입력 배열의 원소 값 개수를 누적합으로 구성한 배열로 정렬을 수행한다.
    */
    public static void countingSort(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2001];

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true;
        }

        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                sb.append(i - 1000).append('\n');
            }
        }
        System.out.println(sb);
    }
}
