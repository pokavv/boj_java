package StringOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class str_9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();
            String front = String.valueOf(str.charAt(0));
            String back = String.valueOf(str.charAt(str.length() - 1));
            System.out.println(front + back);
        }
    }
}
