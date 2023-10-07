package InputOutput.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11382 boj
// BufferedReader + split() 사용
public class doublePlusV2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        long c = Long.parseLong(str[2]);

        System.out.println(a + b + c);
    }
}
