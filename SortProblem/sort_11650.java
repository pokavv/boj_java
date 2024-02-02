package SortProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sort_11650 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            } else {
                return x[0] - y[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}

/*
먼저 입력 개수 N 을 받는다.
다음 줄에 StringTokenizer 을 생성과 동시에 BufferedReader.readLine() 으로 한 줄을 입력받으면서 공백(" ")으로 구분시켜준다.
다음으로 맨 처음 max 값을 -1 로 초기화 한다. (입력받을 값이 0보다 크거나 같기 때문)
그리고 StringTokenizer 의 토큰(분리된 문자열)을 꺼내오면서 value에 저장한 뒤 max 값과 비교하고, sum 에 value 값을 더해준다.
그리고 굳이 매번 하나의 value 마다 (value/max)*100 을 해주면서 sum 에 더해주는 것 보다는 마지막에 한번에 연산한 값을 출력해주는게 연산을 덜 할 것이다.
(이때 sum 이 double이라 연산값 또한 double 로 형변환 되어 반환된다.)

예로들어 3, 7, 6, 2 라는 값을 입력받았을때
(3/7)*100 + (7/7)*100 + (6/7)*100 + (2/7)*100 이렇게 하나
((3+7+6+2) / 7)*100 을 하나 값은 같기 때문에 상관이 없다.

참고로 오차범위가 10^(-2) 이니까 자동형변환을 사용해도 된다는 것이다.
만약 오차범위가 아주아주 작아야 한다면(예로들어 1/1,000,000,000,000) 모두 double형으로 해주는게 가장 안전하다.
왜냐하면 형 변환을 하는 과정중에 데이터 손실이 발생할 수도 있기 때문이다.
 */