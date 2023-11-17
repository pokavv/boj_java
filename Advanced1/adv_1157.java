package Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adv_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] alp = new int[26];// 알파벳 26
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                alp[str.charAt(i) - 97]++; // 소문자 a~z
            } else {
                alp[str.charAt(i) - 65]++; // 대문자 A~Z
            }
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (alp[i] > max) {
                max = alp[i];
                ch = (char) (i + 65);
            } else if (alp[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
