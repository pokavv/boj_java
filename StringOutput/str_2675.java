package StringOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class str_2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] strArray = br.readLine().split(" ");

            int R = Integer.parseInt(strArray[0]);
            for (byte val : strArray[1].getBytes()) {
                for (int j = 0; j < R; j++) {
                    sb.append((char) val);
                }
            }

            sb.append('\n');
        }
        System.out.println(sb);
    }
}
