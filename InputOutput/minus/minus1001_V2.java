package InputOutput.minus;

// BufferedReader + split() 사용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minus1001_V2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        System.out.println(a - b);
    }
}
