package Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adv_1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

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

        String str = br.readLine();
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                }
                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
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
