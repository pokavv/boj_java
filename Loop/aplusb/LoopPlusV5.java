package Loop.aplusb;

import java.io.*;

public class LoopPlusV5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println(a + b);
        }

        br.close();
    }
}
