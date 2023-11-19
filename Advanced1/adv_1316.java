package Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adv_1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean check() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i); // i 번째 문자 저장 (현재 문자)

            // 이전 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우 (false)
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true; // true 로 바꾼다
                    prev = now; // 다음 턴을 위해 prev 도 true 로 바꾼다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹 단어가 아니게 됨)
                else {
                    return false; // 함수 종료
                }
            }

            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            continue;
        }
        return true;
    }
}
