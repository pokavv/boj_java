package InputOutput.divide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader + split() 사용
public class divide1008_V2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bufferedReader.readLine().split(" ");
        double a = Integer.parseInt(str[0]);
        double b = Integer.parseInt(str[1]);

        System.out.println(a / b);
    }
}
