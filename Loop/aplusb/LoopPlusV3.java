package Loop.aplusb;

import java.io.*;

public class LoopPlusV3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            bw.write( "Case #" + i + ": " + (a + b) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
