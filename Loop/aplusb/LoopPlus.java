package Loop.aplusb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopPlus {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());


        for (int i = 0; i < testCase; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            System.out.println(a + b);
        }
    }
}
