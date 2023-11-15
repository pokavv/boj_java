package StringOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class str_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (char ch = 'a'; ch <= 'z'; ch++) {
//            System.out.println(ch);
            sb.append(str.indexOf(ch) + " ");
        }

        System.out.println(sb);
    }
}
